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
  isDisabled:boolean=false;
  constructor() { }

  ngOnInit(): void {
    // this.firstName='';
    // this.lastName='';
    this.btnTxt=this.isDisabled?'Disabled':'Click Me';

  }

  // getFullName():string{
  //   return this.firstName+' '+this.lastName;
  // }

  showInfo(){
      alert("Person Registered..");
  }

  // clickMe(firstName:any,lastName:any){
  //   this.firstName=firstName.value;
  //   this.lastName=lastName.value;
  // }

}
