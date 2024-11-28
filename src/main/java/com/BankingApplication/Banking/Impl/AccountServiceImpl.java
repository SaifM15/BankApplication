package com.BankingApplication.Banking.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.stereotype.Service;

import com.BankingApplication.Banking.Dto.AccountDto;
import com.BankingApplication.Banking.Entity.Account;
import com.BankingApplication.Banking.Mapper.AccountMapper;
import com.BankingApplication.Banking.Repository.AccountRepository;
import com.BankingApplication.Banking.Service.AccountService;

@Service
public class AccountServiceImpl  implements AccountService{
	

	private AccountRepository accountRepository;

	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountdto) {
		Account account = AccountMapper.maptoAccount(accountdto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.maptoAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Long id) {
	Account account=accountRepository
			.findById(id)
			.orElseThrow(()-> new RuntimeException("Account Does not Exist"));
		return AccountMapper.maptoAccountDto(account);
	}

}
