import { Component, OnInit } from '@angular/core';
import { PersonDataService } from '../person-data.service';
import { Person } from '../show/Person';

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent implements OnInit {

  person:Person=new Person();
  personList: Array<Person>=[];
  constructor(private personData:PersonDataService) { }

  ngOnInit(): void {
  }

  addPerson(person:Person){

    console.log(person);
    this.personData.personList.push(person);
    alert("Person Details Added..");
  }



}
