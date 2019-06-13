import config
import requests
import json
import os 
import time
import datetime
# get_access_token will return a token which we will need to pull the data from the server
def get_Jobs(server_url,projectid,projectname,private_token):
	api_url = server_url+'/api/v4/projects/'+str(projectid)+'/jobs?private_token='+str(private_token)
	command= "curl -k "+str(api_url)
	jobs = os.popen(command).read()
	d = json.loads(jobs.replace("'", "\""))
	jobsID=[]
	for i in range(len(d)):
		p={}
		p["jobID"]=str(d[i]["id"])
		p["name"]= str(d[i]["name"])
		p["scmRevisionNumber"]=str(d[i]["commit"]["id"])
		p["scmAuthor"]=str(d[i]["commit"]["committer_name"])
		p["scmCommitLog"]=str(d[i]["commit"]["title"])
		p["scmCommitTimestamp"]=str(d[i]["commit"]["committed_date"])
		p["pipelineID"]=str(d[i]["pipeline"]["id"])
		jobsID.append(p)
	
	return jobsID