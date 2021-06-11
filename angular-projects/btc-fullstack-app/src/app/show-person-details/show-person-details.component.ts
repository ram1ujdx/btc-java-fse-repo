import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Person } from '../Person';
import { PersonApiServiceService } from '../person-api-service.service';

@Component({
  selector: 'app-show-person-details',
  templateUrl: './show-person-details.component.html',
  styleUrls: ['./show-person-details.component.css']
})
export class ShowPersonDetailsComponent implements OnInit {

  constructor(private _route:ActivatedRoute,private _personApi:PersonApiServiceService) { }

  person!:Person;

  ngOnInit(): void {
    this._route.params.subscribe(
      params=>{
        let personName=params['person-name'];
        this._personApi.getPersonByName(personName).subscribe(
          person=>{
            this.person=person;
          },
          error=>{
            alert("Person Not Found/ Server Error");
          }

        )
       
      }
    )
  }

}
