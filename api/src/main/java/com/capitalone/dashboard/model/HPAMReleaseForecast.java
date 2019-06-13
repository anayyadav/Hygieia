package com.capitalone.dashboard.model;

public class HPAMReleaseForecast {

	private String workspaceid;
	private String enddate;
	private String startdate;
	private String releaseid;
	private Object releasescope;
	private Object donesp;
	private String today;
	public String getWorkspaceid() {
		return workspaceid;
	}
	public void setWorkspaceid(String workspaceid) {
		this.workspaceid = workspaceid;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getReleaseid() {
		return releaseid;
	}
	public void setReleaseid(String releaseid) {
		this.releaseid = releaseid;
	}
	public Object getReleasescope() {
		return releasescope;
	}
	public void setReleasescope(Object releasescope) {
		this.releasescope = releasescope;
	}
	public Object getDonesp() {
		return donesp;
	}
	public void setDonesp(Object donesp) {
		this.donesp = donesp;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
}
