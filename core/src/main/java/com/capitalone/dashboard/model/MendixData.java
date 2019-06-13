package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mendixdata")
public class MendixData extends BaseModel {

	MendixData() {

	}
	private List<BuildApiDetail> buildApiDetails = new ArrayList<>();
	private List<DeployApiDetail> deployApiDetails = new ArrayList<>();
	private List<TeamserverApiBranchDetail> teamserverApiBranchDetails = new ArrayList<>();
	private List<TeamserverApiRevisionDetail> teamserverApiRevisionDetails = new ArrayList<>();
	public List<BuildApiDetail> getBuildApiDetails() {
		return buildApiDetails;
	}
	public void setBuildApiDetails(List<BuildApiDetail> buildApiDetails) {
		this.buildApiDetails = buildApiDetails;
	}
	public List<DeployApiDetail> getDeployApiDetails() {
		return deployApiDetails;
	}
	public void setDeployApiDetails(List<DeployApiDetail> deployApiDetails) {
		this.deployApiDetails = deployApiDetails;
	}
	public List<TeamserverApiBranchDetail> getTeamserverApiBranchDetails() {
		return teamserverApiBranchDetails;
	}
	public void setTeamserverApiBranchDetails(List<TeamserverApiBranchDetail> teamserverApiBranchDetails) {
		this.teamserverApiBranchDetails = teamserverApiBranchDetails;
	}
	public List<TeamserverApiRevisionDetail> getTeamserverApiRevisionDetails() {
		return teamserverApiRevisionDetails;
	}
	public void setTeamserverApiRevisionDetails(List<TeamserverApiRevisionDetail> teamserverApiRevisionDetails) {
		this.teamserverApiRevisionDetails = teamserverApiRevisionDetails;
	}
	public MendixData(List<BuildApiDetail> buildApiDetails, List<DeployApiDetail> deployApiDetails,
			List<TeamserverApiBranchDetail> teamserverApiBranchDetails,
			List<TeamserverApiRevisionDetail> teamserverApiRevisionDetails) {
		super();
		this.buildApiDetails = buildApiDetails;
		this.deployApiDetails = deployApiDetails;
		this.teamserverApiBranchDetails = teamserverApiBranchDetails;
		this.teamserverApiRevisionDetails = teamserverApiRevisionDetails;
	}
	@Override
	public String toString() {
		return "MendixData [buildApiDetails=" + buildApiDetails + ", deployApiDetails=" + deployApiDetails
				+ ", teamserverApiBranchDetails=" + teamserverApiBranchDetails + ", teamserverApiRevisionDetails="
				+ teamserverApiRevisionDetails + "]";
	}
	
	
}
