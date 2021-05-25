import { Component, OnInit } from '@angular/core';
import { Person } from './Person';

@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {

  
  person:Person=new Person();
  btnTxt:string='Click Me';
  date:Date=new Date();
  isDisabled:boolean=false;
  personList:Array<Person>=[];
  constructor() { }

  ngOnInit(): void {
    // this.firstName='';
    // this.lastName='';
    this.btnTxt=this.isDisabled?'Disabled':'Click Me';
    this.date.setDate(28);

  }

  // getFullName():string{
  //   return this.firstName+' '+this.lastName;
  // }

  showInfo(){
      alert("Person Registered..");
  }

  getBackgroundColor(age:number):string{

    return age>=18?'green':'yellow';

  }


  getStyleClass(age:number):string{

    
     if(age>=60){
        return 'old';
    }
    else if(age>=30){
      return 'mid-age';
    }
    else{
      return 'young';
    }

  }


  addPerson(firstName:string,lastName:string,email:string,age:number){

    let person=new Person();
    person.age=age;
    person.lastName=lastName;
    person.email=email;
    person.firstName=firstName;

    this.personList.push(person);
    console.log(this.personList);


  }


  // clickMe(firstName:any,lastName:any){
  //   this.firstName=firstName.value;
  //   this.lastName=lastName.value;
  // }

}
