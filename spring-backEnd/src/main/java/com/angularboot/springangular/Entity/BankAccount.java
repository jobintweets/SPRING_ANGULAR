package com.angularboot.springangular.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BankAccount {
  @Id
  @Column
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  @Column
  private int account_number;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name="person_id")
  private Person person;

}
