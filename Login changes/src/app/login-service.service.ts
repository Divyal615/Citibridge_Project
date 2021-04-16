import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserKey } from './user-key';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private http : HttpClient) { }

  public loginUser(user :UserKey):Observable<any>{

    return this.http.post("http://localhost:8081/user/index",user)
  }
}
