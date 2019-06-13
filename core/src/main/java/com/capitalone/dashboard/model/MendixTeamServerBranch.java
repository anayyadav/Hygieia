package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mendixteamserverbranch")
public class MendixTeamServerBranch {

	private List<TeamserverApiBranchDetail> teamserverApiBranchDetails = new ArrayList<>();

	public List<TeamserverApiBranchDetail> getTeamserverApiBranchDetails() {
		return teamserverApiBranchDetails;
	}

	public void setTeamserverApiBranchDetails(List<TeamserverApiBranchDetail> teamserverApiBranchDetails) {
		this.teamserverApiBranchDetails = teamserverApiBranchDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teamserverApiBranchDetails == null) ? 0 : teamserverApiBranchDetails.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MendixTeamServerBranch other = (MendixTeamServerBranch) obj;
		if (teamserverApiBranchDetails == null) {
			if (other.teamserverApiBranchDetails != null)
				return false;
		} else if (!teamserverApiBranchDetails.equals(other.teamserverApiBranchDetails))
			return false;
		return true;
	}

	public MendixTeamServerBranch(List<TeamserverApiBranchDetail> teamserverApiBranchDetails) {
		super();
		this.teamserverApiBranchDetails = teamserverApiBranchDetails;
	}

	@Override
	public String toString() {
		return "MendixTeamServerBranch [teamserverApiBranchDetails=" + teamserverApiBranchDetails + "]";
	}

}
