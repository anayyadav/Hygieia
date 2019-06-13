package com.capitalone.dashboard.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employeedetails")
public class EmployeeDetails extends BaseModel {
	@Indexed(unique = true)
	private String empid;
	private String empname;
	private String empaddress;

	EmployeeDetails() {
	}

	public EmployeeDetails(String empid, String empname, String empaddress) {
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

}
