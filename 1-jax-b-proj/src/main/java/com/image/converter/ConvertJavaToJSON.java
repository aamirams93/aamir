package com.image.converter;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.image.binding.Address;
import com.image.binding.Employee;

public class ConvertJavaToJSON
{
	public static void main(String[] args) throws Exception
	{
		Address a = new  Address();
		a.setCountryName("India");
		a.setCity("Delhi");
		a.setPinCode(110025);
		
		Employee p = new Employee();
		p.setEmpid(101);
		p.setEmpName("aamir");
		p.setEmpAge(18);
		p.setEmpPhoneNo("8982");

		// Create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// Convert object to JSON and save to file
		objectMapper.writeValue(new File("Employee.json"), p);

		System.out.println("JSON conversion completed...!!");
	}
}
