package com.BankingApplication.Banking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingApplication.Banking.Entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{

}
