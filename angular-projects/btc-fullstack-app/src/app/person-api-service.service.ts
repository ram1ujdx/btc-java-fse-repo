import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AuthToken } from './AuthToken';
import { Credentials } from './Credentials';
import { Person } from './Person';

@Injectable({
  providedIn: 'root'
})
export class PersonApiServiceService {

  baseUrl="http://localhost:8000/api"

  constructor(private _http:HttpClient) { }

  public addPerson(person:Person):Observable<Person>{
    return this._http.post<Person>(this.baseUrl+'/users/persons',person);

  }

  public getPersonByName(personName:string):Observable<Person>{
    return this._http.get<Person>(this.baseUrl+"/users/persons/person-name/"+personName);
  }


  public updatePerson(person:Person):Observable<Person>{
    return this._http.put<Person>(this.baseUrl+'/users/persons',person);

  }

  public deletePerson(personId:number):Observable<boolean>{
    return this._http.delete<boolean>(this.baseUrl+"/users/persons/id/"+personId);
  }


  public getAllPersons():Observable<Array<Person>>{
    return this._http.get<Array<Person>>(this.baseUrl+"/users/persons");
  }

  public login(userCred:Credentials):Observable<AuthToken>{
    return this._http.post<AuthToken>(this.baseUrl+"/public/login",userCred);
  }



}
