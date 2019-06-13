package com.capitalone.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.capitalone.dashboard.model.HPAMData;

@Service
public  class HPAMServiceImpl implements HPAMService {
	
	public HPAMServiceImpl(){	
	}
	
	@Autowired
    private MongoTemplate operations;
	

	public List<HPAMData> getHPAMTeam() {

		return this.operations.findAll(HPAMData.class);

	}

	public void setOperations(MongoTemplate operations) {
		this.operations = operations;
	}
	
}
