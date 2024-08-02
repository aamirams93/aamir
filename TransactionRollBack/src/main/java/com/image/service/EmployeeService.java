package com.image.service;

import org.springframework.stereotype.Service;

import com.image.entity.Address;
import com.image.entity.Employee;
import com.image.repository.AddressRepo;
import com.image.repository.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService
{
	private EmployeeRepo empRepo;
	private AddressRepo addRepo;

	public EmployeeService(EmployeeRepo empRepo, AddressRepo addRepo)
	{
		super();
		this.empRepo = empRepo;
		this.addRepo = addRepo;
	}

	@Transactional(rollbackOn = Exception.class)
	public void saveData()
	{
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Sohan");
		emp.setEmpSal(10000.00);
		empRepo.save(emp);

		int i = 10 / 0;

		Address add = new Address();
		add.setAddrId(855);
		add.setCity("Kishanganj");
		add.setState("Bihar");
		add.setCountry("India");
		add.setEmdId(101);
		addRepo.save(add);
	}

}
