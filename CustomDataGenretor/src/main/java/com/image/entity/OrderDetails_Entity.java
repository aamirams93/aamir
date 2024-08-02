package com.image.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "ORDER_DETAILS")
public class OrderDetails_Entity
{
	@Column(name = "ORDER_ID")
	private String OrderId;
	
	@Column(name = "ORDER_BY")
	private String OrderBy;
	
	@Column(name = "ORDER_Placed_DATE")
	private Date OrderPlacedDate;

}
