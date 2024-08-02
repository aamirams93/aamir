package com.image.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Serializable>
{

}
