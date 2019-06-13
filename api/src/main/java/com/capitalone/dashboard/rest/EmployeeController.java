package com.capitalone.dashboard.rest;

import com.capitalone.dashboard.model.EmployeeDetails;
import com.capitalone.dashboard.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class EmployeeController {

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping(value = "/employeeDetails", method = GET, produces = APPLICATION_JSON_VALUE)
	public Iterable<EmployeeDetails> employeeDetails() {
		return employeeService.all();
	}

}
