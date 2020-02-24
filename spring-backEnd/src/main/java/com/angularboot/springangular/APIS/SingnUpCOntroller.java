package com.angularboot.springangular.APIS;

import com.angularboot.springangular.Entity.BankAccount;
import com.angularboot.springangular.Entity.Person;
import com.angularboot.springangular.repositories.BankAccountRepository;
import com.angularboot.springangular.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class SingnUpCOntroller {
  @Autowired
  PersonRepository personRepository;
  @Autowired
BankAccountRepository bankRepository;

  public SingnUpCOntroller(PersonRepository personRepository,BankAccountRepository bankRepository) {
    this.personRepository=personRepository;
    this.bankRepository=bankRepository;
  }

  @PostMapping("/signup")

  public String Signup(@RequestBody Person person) {
    Person emailfound = personRepository.findByEmail(person.getEmail());
    if(emailfound== null){
      personRepository.save(person);
      return "Success";
    }
    else {
    return "Email Taken";
    }
  }

  @PostMapping("/bankaccount")
  public BankAccount bank_account(@RequestBody BankAccount bank){
//    return  bank;
return  bankRepository.save(bank);

  }

}
