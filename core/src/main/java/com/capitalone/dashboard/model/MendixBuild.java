package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mendixbuild")
public class MendixBuild extends BaseModel {

	private List<BuildApiDetail> buildApiDetails = new ArrayList<>();

	public List<BuildApiDetail> getBuildApiDetails() {
		return buildApiDetails;
	}

	public void setBuildApiDetails(List<BuildApiDetail> buildApiDetails) {
		this.buildApiDetails = buildApiDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildApiDetails == null) ? 0 : buildApiDetails.hashCode());
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
		MendixBuild other = (MendixBuild) obj;
		if (buildApiDetails == null) {
			if (other.buildApiDetails != null)
				return false;
		} else if (!buildApiDetails.equals(other.buildApiDetails))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MendixBuild [buildApiDetails=" + buildApiDetails + "]";
	}

	public MendixBuild(List<BuildApiDetail> buildApiDetails) {
		super();
		this.buildApiDetails = buildApiDetails;
	}

}
