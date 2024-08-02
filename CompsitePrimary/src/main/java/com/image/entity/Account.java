package com.image.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "BANK_ACCOUNTS")
public class Account
{
	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "MIN_BALANCE")
	private Double minBal;
	
	@EmbeddedId
	private AccountPk accPk;

}
