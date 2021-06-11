import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Person } from '../Person';
import { PersonApiServiceService } from '../person-api-service.service';

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent implements OnInit {

  person:Person=new Person();
  personList: Array<Person>=[];
  constructor( private _router:Router, private _personApi:PersonApiServiceService) { }

  ngOnInit(): void {
  }

  addPerson(person:Person){


    this._personApi.addPerson(person).subscribe(
      response=>{
        console.log(person);
        alert("Person Details Added..");
         this._router.navigate(['/show-person/'+person.personName]);
      }
    )
   
    

  }



}
