import { SignupService } from './../signup.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
// tslint:disable-next-line: variable-name
signup_data = {
  "email": 'testemail1@gmail.com',
  "name": 'rohith',
  "password": '12345'
};
bankaccount_data ={
  "person_id": 15,
  "account_number": 13365
}
  constructor(private signup: SignupService) { }

  ngOnInit(): void {
  // this.account_signup(this.signup_data);
  this.bank_account(this.bankaccount_data);
  }
public account_signup(data) {
  this.signup.signup_client(data).subscribe(result=> console.log(result));
}
public bank_account(data) {
  this.signup.addBank_account(data).subscribe(result=> console.log(result));
}
}
