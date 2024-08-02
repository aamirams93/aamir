package com.image.bindings;

import com.image.bindings.PassengerInfo;

import lombok.Data;

@Data
public class PassengerInfo
{
	private String name;
	private Long phno;
	private String jDate;
	private String jfrom;
	private String jTo;
	private Integer trainNo;

}