import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class SignupService {

  constructor(private http: HttpClient) { }

  public signup_client(data){
    console.log(data);
return this.http.post('http://localhost:8080/signup',data,{responseType: 'text' as 'json'});

  }

  public addBank_account(data) {
    return this.http.post('http://localhost:8080/bankaccount', data, {responseType: 'text' as 'json'});
  }
}
