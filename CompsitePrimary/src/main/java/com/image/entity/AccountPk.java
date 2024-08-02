package com.image.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AccountPk implements Serializable
{
	private int accId;
	private String accType;
	private String holderName;
}
