package com.capitalone.dashboard.model;

public class GitlabBuild {

	private String projectName;
	private int number;
	private String buildUrl;
	private Object sourceChangeSet;
	private String user;
	private String startTime;
	private String projectID;
	private Long duration;
	private String endTime;
	private String collectorItemId;
	private String buildStatus;
	public Object getSourceChangeSet() {
		return sourceChangeSet;
	}
	public void setSourceChangeSet(Object sourceChangeSet) {
		this.sourceChangeSet = sourceChangeSet;
	}
	public String getCollectorItemId() {
		return collectorItemId;
	}
	public void setCollectorItemId(String collectorItemId) {
		this.collectorItemId = collectorItemId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getBuildUrl() {
		return buildUrl;
	}
	public void setBuildUrl(String buildUrl) {
		this.buildUrl = buildUrl;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getBuildStatus() {
		return buildStatus;
	}
	public void setBuildStatus(String buildStatus) {
		this.buildStatus = buildStatus;
	}
	
	
	
}
