package com.capitalone.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.capitalone.dashboard.model.MendixData;

@Service
public class MendixDataServiceImpl implements MendixDataService {
	
	//private MendixDataRepository mendixDataRepository;
	public MendixDataServiceImpl(){
		
	}
	
	@Autowired
    private MongoTemplate operations;
	
	/*@Autowired
	public MendixDataServiceImpl(MendixDataRepository mendixDataRepository) {
		this.mendixDataRepository =mendixDataRepository;
		
	}	*/
	public List<MendixData> getMendixDeployData() {

		return this.operations.findAll(MendixData.class);

	}

	public void setOperations(MongoTemplate operations) {
		this.operations = operations;
	}
	
	
	
}
