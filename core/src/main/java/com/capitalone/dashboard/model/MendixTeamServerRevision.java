package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mendixteamserverrevision")
public class MendixTeamServerRevision {

	private List<TeamserverApiRevisionDetail> teamserverApiRevisionDetails = new ArrayList<>();

	public List<TeamserverApiRevisionDetail> getTeamserverApiRevisionDetails() {
		return teamserverApiRevisionDetails;
	}

	public void setTeamserverApiRevisionDetails(List<TeamserverApiRevisionDetail> teamserverApiRevisionDetails) {
		this.teamserverApiRevisionDetails = teamserverApiRevisionDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((teamserverApiRevisionDetails == null) ? 0 : teamserverApiRevisionDetails.hashCode());
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
		MendixTeamServerRevision other = (MendixTeamServerRevision) obj;
		if (teamserverApiRevisionDetails == null) {
			if (other.teamserverApiRevisionDetails != null)
				return false;
		} else if (!teamserverApiRevisionDetails.equals(other.teamserverApiRevisionDetails))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MendixTeamServerRevision [teamserverApiRevisionDetails=" + teamserverApiRevisionDetails + "]";
	}

	public MendixTeamServerRevision(List<TeamserverApiRevisionDetail> teamserverApiRevisionDetails) {
		super();
		this.teamserverApiRevisionDetails = teamserverApiRevisionDetails;
	}

}
