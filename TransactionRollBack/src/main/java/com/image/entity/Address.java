package com.image.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="TBL_EMP_ADDRESS")
public class Address
{
	@Id
	@Column(name="ADDRESS_ID")
	private Integer addrId;
	
	private String city;
	
	private String state;
	
	private String Country;
	
	@Column(name="EMP_ID")
	private Integer emdId;

}
