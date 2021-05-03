import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
//import { UserKey } from './user-key';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private http : HttpClient) { }

  public loginUser(username :string, password: string): Observable<any>{
    const headers=new HttpHeaders({Authorization: 'Basic'+btoa(username+":"+password)})
    return this.http.get("http://localhost:8081/user/index",{headers,responseType: 'text'})
  }
}
