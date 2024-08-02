package com.image.binding;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee
{
	@JsonProperty(value = "EmployeeID") // to change the var name
	private Integer empid;

	private String empName;

	private Integer empAge;

	private String empPhoneNo;
	
	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	private Address address;

	public Integer getEmpid()
	{
		return empid;
	}

	public void setEmpid(Integer empid)
	{
		this.empid = empid;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public Integer getEmpAge()
	{
		return empAge;
	}

	public void setEmpAge(Integer empAge)
	{
		this.empAge = empAge;
	}

	public String getEmpPhoneNo()
	{
		return empPhoneNo;
	}

	public void setEmpPhoneNo(String empPhoneNo)
	{
		this.empPhoneNo = empPhoneNo;
	}

}
