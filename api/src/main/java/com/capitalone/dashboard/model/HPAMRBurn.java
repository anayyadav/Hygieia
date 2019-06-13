package com.capitalone.dashboard.model;

import java.io.Serializable;

public class HPAMRBurn implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String today;
	private String releaseid;
	private String startdate;
	private String enddate;
	private String remainingSP;
	
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	
	public String getReleaseid() {
		return releaseid;
	}
	public void setReleaseid(String releaseid) {
		this.releaseid = releaseid;
	}
	
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getRemainingSP() {
		return remainingSP;
	}
	public void setRemainingSP(String remainingSP) {
		this.remainingSP = remainingSP;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
	
	
	