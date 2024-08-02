package com.image.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.entity.Account;
import com.image.entity.AccountPk;

public interface AccountRepository extends JpaRepository<Account, AccountPk>
{
	
}