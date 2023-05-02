package com.bank.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bank.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
