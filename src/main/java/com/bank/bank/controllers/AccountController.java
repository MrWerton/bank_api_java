package com.bank.bank.controllers;

import com.bank.bank.controllers.services.AccountService;
import com.bank.bank.entities.Account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> findAllAccount() {
        return accountService.findAll();
    }

}
