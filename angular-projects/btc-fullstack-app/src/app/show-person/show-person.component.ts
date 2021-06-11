import { Component, OnInit } from '@angular/core';
import { Person } from '../Person';
import { PersonApiServiceService } from '../person-api-service.service';


@Component({
  selector: 'app-show-person',
  templateUrl: './show-person.component.html',
  styleUrls: ['./show-person.component.css']
})
export class ShowPersonComponent implements OnInit {

  personList!:Array<Person>;
  constructor(private _personApi:PersonApiServiceService) { 
  
  }

  ngOnInit(): void {

      this._personApi.getAllPersons().subscribe(
        (personList)=>{
          console.log(personList);
          this.personList=personList;
        }

      )

  }

  deletePerson(id:number){
   if( confirm("Sure to Delete?")){

    this._personApi.deletePerson(id).subscribe(
      response=>{
        if(response){
          alert("Deleted Person [ID - "+id+"]");
        }
        else{
          alert("Unable to delete Person [ID - "+id+"]");
        }
      },
      eroor=>{
        alert("Error!!! Unable to delete Person [ID - "+id+"]");
      }
    )
   
   }
  }


}
