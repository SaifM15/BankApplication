package com.BankingApplication.Banking.Service;

import com.BankingApplication.Banking.Dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountdto);
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id,double amount);
	
	AccountDto withdraw(Long id,double amount);


}
