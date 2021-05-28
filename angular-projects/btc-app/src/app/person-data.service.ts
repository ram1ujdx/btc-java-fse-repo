import { Injectable } from '@angular/core';
import { Person } from './show/Person';

@Injectable({
  providedIn: 'root'
})
export class PersonDataService {

personList:Array<Person>=[
{
  firstName:'Rahul',
  lastName:'Dutta',
  age:25,
  email:'rahul@yahoo.com',
  salary:25550.0
},
{
  firstName:'Harsh',
  lastName:'Verma',
  age:23,
  email:'harsh@yahoo.com',
  salary:28550.0
},
{
  firstName:'Rohit',
  lastName:'Reddy',
  age:24,
  email:'rohit@yahoo.com',
  salary:35550.0
},



];


  constructor() {


   }


   deletePerson(index:number){
      this.personList.splice(index,1);
   }

   getPersonDetails(index:number):Person{
    return this.personList[index];
   }
}
