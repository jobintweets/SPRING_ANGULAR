package com.angularboot.springangular.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "person_details")
public class Person {
  @Id
  @GeneratedValue
  @Column
  private  int id;
  @Column
  private String name;
  @Column
  private String email;
  @Column
  private String password;
  @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)

  private Set<BankAccount> account=new HashSet<>() ;
}
