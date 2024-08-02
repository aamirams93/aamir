package com.image.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TBL_EMPLOYEE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee
{
	@Id
	@Column(name="EMPLOYEE_ID")
	private Integer empId;
	
	@Column(name="EMPLOYEE_NAME")
	private String empName;
	private Double empSal;

}
