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
  email:'rahul@yahoo.com'
},
{
  firstName:'Harsh',
  lastName:'Verma',
  age:23,
  email:'harsh@yahoo.com'
},
{
  firstName:'Rohit',
  lastName:'Reddy',
  age:24,
  email:'rohit@yahoo.com'
},



];


  constructor() {


   }


   deletePerson(index:number){
      this.personList.splice(index,1);
   }
}
