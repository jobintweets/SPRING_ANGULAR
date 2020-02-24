package com.angularboot.springangular.repositories;

import com.angularboot.springangular.Entity.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository <BankAccount,Integer> {
}
