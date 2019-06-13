package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document; @Document(collection = "gitlabbuild") 
public class GitlabData extends BaseModel {
	GitlabData(){
	}
	
	private List<GitlabBuild> gitlabBuild = new ArrayList<>();

	public List<GitlabBuild> getGitlabBuild() {
		return gitlabBuild;
	}

	public void setGitlabBuild(List<GitlabBuild> gitlabBuild) {
		this.gitlabBuild = gitlabBuild;
	}
	
	public GitlabData( List<GitlabBuild> gitlabBuild) {
		super();
		this.gitlabBuild = gitlabBuild;
	
	}
	@Override
	public String toString() {
		return "gitlabBuild=" + gitlabBuild;
	}
}
