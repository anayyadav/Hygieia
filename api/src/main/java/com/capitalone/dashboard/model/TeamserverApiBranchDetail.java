package com.capitalone.dashboard.model;

import org.bson.types.ObjectId;

public class TeamserverApiBranchDetail {
	private String displayname;
	private String latestrevisionmendixversion;
	private int latestrevisionnumber;
	private String name;
	private ObjectId id;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public String getLatestrevisionmendixversion() {
		return latestrevisionmendixversion;
	}

	public void setLatestrevisionmendixversion(String latestrevisionmendixversion) {
		this.latestrevisionmendixversion = latestrevisionmendixversion;
	}

	public int getLatestrevisionnumber() {
		return latestrevisionnumber;
	}

	public void setLatestrevisionnumber(int latestrevisionnumber) {
		this.latestrevisionnumber = latestrevisionnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
