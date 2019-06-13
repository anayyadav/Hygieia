package com.capitalone.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.capitalone.dashboard.model.GitlabData;

@Service
public  class GITLABServiceImpl implements GITLABService {
	
	public GITLABServiceImpl(){	
	}
	
	@Autowired
    private MongoTemplate operations;
	

	public List<GitlabData> getGILTABTeam() {

		return this.operations.findAll(GitlabData.class);

	}

	public void setOperations(MongoTemplate operations) {
		this.operations = operations;
	}
	
}
