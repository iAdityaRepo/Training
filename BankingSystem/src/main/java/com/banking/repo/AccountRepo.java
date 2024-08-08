package com.banking.repo;


import com.banking.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,Integer> {

}