package com.image.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.image.entity.Account;
import com.image.entity.AccountPk;
import com.image.repositor.AccountRepository;

@Service
public class AccountService
{
	private AccountRepository accRepo;
	
	public AccountService(AccountRepository accRepo)
	{
		this.accRepo=accRepo;
	}
	
	public void saveData()
	{
		AccountPk pk = new AccountPk();
		pk.setAccId(104);
		pk.setAccType("Saving");
		pk.setHolderName("Aamir");
		
		Account ac = new Account();
		ac.setBranchName("KalkaJi");
		ac.setMinBal(1000.00);
		ac.setAccPk(pk); ///set pk class object into entity object
		
		accRepo.save(ac);
	}
	
	public void getDetailsPk()
	{
		AccountPk pk = new AccountPk();
		pk.setAccId(104);
		pk.setAccType("Saving");
		pk.setHolderName("Aamir");
		

		
		Optional<Account> findByid = accRepo.findById(pk);
		if(findByid.isPresent())
		{
			System.out.println(findByid.get());
		}
	}

}
