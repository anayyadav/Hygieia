import config
import requests
import json
import os 
import time
import datetime
import jobadata

# get_access_token will return a token which we will need to pull the data from the server
def get_Pipeline(server_url,projectid,projectname,private_token):
	api_url = server_url+'/api/v4/projects/'+str(projectid)+'/pipelines?private_token='+str(private_token)
	command= "curl -k "+str(api_url)
	pipelines = os.popen(command).read()
	d = json.loads(pipelines.replace("'", "\""))
	pipelineID=[]
	for i in range(len(d)):
		p={}
		p["pID"]=str(d[i]["id"])
		pipelineID.append(p)
	
	return pipelineID
	
def get_PipelineData(server_url,projectid,projectname,pipelineid,private_token):
	api_url = server_url+'/api/v4/projects/'+str(projectid)+'/pipelines/'+str(pipelineid)+'?private_token='+str(private_token)
	command= "curl -k "+str(api_url)
	pipelindata = os.popen(command).read()
	d = json.loads(pipelindata)
	return d
	
def getPipelinedata(collectorID,server_url,projectid,projectname,private_token):
	pipedata=get_Pipeline(server_url,projectid,projectname,private_token)
	pipeline=[]
	for j in range(len(pipedata)):
		data = get_PipelineData(server_url,projectid,projectname,pipedata[j]['pID'],private_token)
		pData={}
		jobs=jobadata.get_Jobs(server_url,projectid,projectname,private_token)
		job=[]
		for i in range(len(jobs)):
			if (jobs[i]['pipelineID'] == pipedata[j]['pID']):
				job.append(jobs[i])
			
		pData["collectorItemId"]=collectorID
		pData["projectName"]=str(projectname)
		pData["projectID"]=str(projectid)
		pData["number"]=data["id"]
		pData["sourceChangeSet"] = job
		pData["buildUrl"]=data["web_url"]
		startAT=""
		endAT=""
		if (data["started_at"] != None):
			startAT= data["started_at"] #datetime.datetime.strptime( data["started_at"], "%Y-%m-%dT%H:%M:%S.%fZ").timetuple()
			pData["startTime"]= startAT
			
		if (data["finished_at"] != None):
			endAT= data["finished_at"] #datetime.datetime.strptime( data["finished_at"], "%Y-%m-%dT%H:%M:%S.%fZ").timetuple()
			pData["endTime"]= endAT
			
		if (data["duration"] != None):
			pData["duration"]= data["duration"]
		else:
			pData["duration"]= 0
	
		pData["buildStatus"]=data["status"]
		pData["user"]=data["user"]['name']
		pipeline.append(pData)
	return pipeline
	
