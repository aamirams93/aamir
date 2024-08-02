package com.image.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Product
{
	private Integer id;
	private String productName;
	private Double price;
}
