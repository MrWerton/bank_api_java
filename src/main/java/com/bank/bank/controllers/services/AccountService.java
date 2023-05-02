package com.bank.bank.controllers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bank.entities.Account;
import com.bank.bank.repositories.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAll() {
        return this.accountRepository.findAll();
    }
}
