import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Person } from './Person';

@Injectable({
  providedIn: 'root'
})
export class PersonApiServiceService {

  baseUrl="http://localhost:8000/api"

  constructor(private _http:HttpClient) { }

  public addPerson(person:Person):Observable<Person>{
    return this._http.post<Person>(this.baseUrl+'/persons',person);

  }

  public getPersonByName(personName:string):Observable<Person>{
    return this._http.get<Person>(this.baseUrl+"/persons/person-name/"+personName);
  }


  public updatePerson(person:Person):Observable<Person>{
    return this._http.put<Person>(this.baseUrl+'/persons',person);

  }

  public deletePerson(personId:number):Observable<boolean>{
    return this._http.delete<boolean>(this.baseUrl+"/persons/id/"+personId);
  }


  public getAllPersons():Observable<Array<Person>>{
    return this._http.get<Array<Person>>(this.baseUrl+"/persons");
  }


}
