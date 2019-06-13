package com.capitalone.dashboard.repository;

import com.capitalone.dashboard.model.EmployeeDetails;

import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<EmployeeDetails, ObjectId> {
	
	

}
