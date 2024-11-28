package com.BankingApplication.Banking.Controller;

import org.apache.catalina.loader.ResourceEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BankingApplication.Banking.Dto.AccountDto;
import com.BankingApplication.Banking.Service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	//	Add account rest API
	@PostMapping
	public ResponseEntity<AccountDto>addAccount(@RequestBody  AccountDto accountDto){
		return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
	}
	
//	Get Account Rest API
	
	public ResponseEntity<AccountDto>getAccountById(Long id){
		return null;
	}

}
