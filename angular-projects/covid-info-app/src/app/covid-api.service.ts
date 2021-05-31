import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Country } from './Country';

@Injectable({
  providedIn: 'root'
})
export class CovidApiService {

  constructor(private _http:HttpClient) {

  }


  public getCountryStatus(countryName:string):Observable<Country>{
    return this._http.get<Country>("https://covid19.mathdro.id/api/countries/"+countryName);
  }
}
