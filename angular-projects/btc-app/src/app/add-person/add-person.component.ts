import { Component, OnInit } from '@angular/core';
import { Person } from '../show/Person';

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent implements OnInit {

  person:Person=new Person();
  personList: Array<Person>=[];
  constructor() { }

  ngOnInit(): void {
  }

  addPerson(person:Person){

    console.log(person);
  }

}
