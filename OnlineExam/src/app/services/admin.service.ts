import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from '../admin';
import { User } from '../user';


@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private _http :HttpClient) { }

  public loginAdminFromRemote(admin : Admin):Observable<any>{
    return this._http.post<any>("http://localhost:8080/exam-rest/rest/login",admin)
  }

  public searchUserFromRemote(user : User):Observable<any>{
    return this._http.post<any>("http://localhost:8080/exam-rest/rest/search",user)
  }

  
}
