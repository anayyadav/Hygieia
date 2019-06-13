package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

public class DeployApiDetail{
	private ObjectId id;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
	private String status;
	private int instances;
	private String mode;
	private boolean production;
	private int memoryperinstance;
	private int totalmemory;
	private String modelversion;
	private String mendixversion;
	private List<Object> tags=new ArrayList<Object>();
	private String url;

	
	
	public List<Object> getTags() {
		return tags;
	}

	public void setTags(List<Object> tags) {
		this.tags = tags;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getInstances() {
		return instances;
	}

	public void setInstances(int instances) {
		this.instances = instances;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public boolean isProduction() {
		return production;
	}

	public void setProduction(boolean production) {
		this.production = production;
	}

	public int getMemoryperinstance() {
		return memoryperinstance;
	}

	public void setMemoryperinstance(int memoryperinstance) {
		this.memoryperinstance = memoryperinstance;
	}

	public int getTotalmemory() {
		return totalmemory;
	}

	public void setTotalmemory(int totalmemory) {
		this.totalmemory = totalmemory;
	}

	public String getModelversion() {
		return modelversion;
	}

	public void setModelversion(String modelversion) {
		this.modelversion = modelversion;
	}

	public String getMendixversion() {
		return mendixversion;
	}

	public void setMendixversion(String mendixversion) {
		this.mendixversion = mendixversion;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
