import config
import requests
import json
import os 
import pipelinedata
from pymongo import MongoClient
import datetime

# get_access_token will return a token which we will need to pull the data from the server

def insertCollector(server_url):
	conn = MongoClient(config.Gitlab_collector['db_host'],config.Gitlab_collector['db_port'])
	db = conn.dashboard
	my_collection = db.collectors
	data={
  "_class": "com.capitalone.dashboard.model.GitlabData",
  "instanceUrls": server_url,
  "name": "gitlab",
  "collectorType": "Build",
  "enabled": True,
  "online": True,
  "errors": {},
  "uniqueFields":{},
  "allFields": {"lastExecuted": datetime.datetime.now()},
  "searchFields": {"0": "description "}
}
	my_collection.insert(data)
	
	
def getPipelinedata(server_url,private_token):
	insertCollector(server_url)
	conn = MongoClient(config.Gitlab_collector['db_host'],config.Gitlab_collector['db_port'])
	db = conn.dashboard
	my_collection = db.collectors
	cursor = my_collection.find()
	data=[]
	collectorID=""
	for record in cursor:
		data.append(record)
	
	for i in range(len(data)):
		if(data[i]["name"] == "gitlab"):
			collectorID = data[i]["_id"]
			
	
	projectData = get_Projects(server_url,private_token)
	project=[]
	final_data={}
	for i in range(len(projectData)):
		project = project+pipelinedata.getPipelinedata(collectorID,server_url,projectData[i]['id'],projectData[i]['name'],private_token)
		
	final_data["gitlabBuild"] = project
	
	conn = MongoClient(config.Gitlab_collector['db_host'],config.Gitlab_collector['db_port'])
	db = conn.dashboard
	print db
	my_collection = db.gitlabbuild
	my_collection.drop()
	my_collection.insert(final_data)

def get_Projects(server_url,private_token):
	api_url = server_url+'/api/v4/projects?private_token='+str(private_token)
	command= "curl -k "+str(api_url)
	projectdata = os.popen(command).read()
	d = json.loads(projectdata.replace("'", "\""))
	return d
	
def main1():
	s_url = config.Gitlab_collector['GITLAB_SERVER']
	if len(s_url) == 0:
		print "Please enter server URL in config.py file "
	else:
		print s_url
		private_token =  config.Gitlab_collector['private_token']
		getPipelinedata(s_url,private_token)

if __name__ == '__main__':
    main1()