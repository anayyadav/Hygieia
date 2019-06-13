package com.capitalone.dashboard.service;

import com.capitalone.dashboard.model.EmployeeDetails;
import com.capitalone.dashboard.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	
	@Override
    public Iterable<EmployeeDetails> all() {
        return employeeRepository.findAll(new Sort(Sort.Direction.ASC, "empid"));
    }

}
