package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mendixdeploy")
public class MendixDeploy extends BaseModel{
	
	private List<DeployApiDetail> deployApiDetails=new ArrayList<DeployApiDetail>();

	public List<DeployApiDetail> getDeployApiDetails() {
		return deployApiDetails;
	}

	public void setDeployApiDetails(List<DeployApiDetail> deployApiDetails) {
		this.deployApiDetails = deployApiDetails;
	}

	

}
