package com.capitalone.dashboard.model;

import org.bson.types.ObjectId;

public class BuildApiDetail {
	private String status;
	private String creationdate;
	private Object expirydate;
	private String description;
	private String version;
	private int size;
	private String packageid;
	private String mendixversion;
	private String creator;
	private String name;
	private ObjectId id;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public Object getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(Object expirydate) {
		this.expirydate = expirydate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getPackageid() {
		return packageid;
	}

	public void setPackageid(String packageid) {
		this.packageid = packageid;
	}

	public String getMendixversion() {
		return mendixversion;
	}

	public void setMendixversion(String mendixversion) {
		this.mendixversion = mendixversion;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}