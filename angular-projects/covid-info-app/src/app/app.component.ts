import { Component } from '@angular/core';
import { Country } from './Country';
import { CovidApiService } from './covid-api.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'covid-info-app';

  constructor(private _covidApiService:CovidApiService){

  }

  countryStats!:Country;

  getCountryStatus(countryName:string){

    this._covidApiService.getCountryStatus(countryName).subscribe(
      response=>{
        this.countryStats=response;
      }
    )

  }


}
