package com.BankingApplication.Banking.Service;

import com.BankingApplication.Banking.Dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountdto);
	
	AccountDto getAccountById(Long id);

}
