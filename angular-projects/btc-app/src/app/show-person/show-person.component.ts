import { Component, OnInit } from '@angular/core';
import { PersonDataService } from '../person-data.service';

@Component({
  selector: 'app-show-person',
  templateUrl: './show-person.component.html',
  styleUrls: ['./show-person.component.css']
})
export class ShowPersonComponent implements OnInit {

  
  constructor(public personData:PersonDataService) { 
  
  }

  ngOnInit(): void {
  }

  deletePerson(i:number){
   if( confirm("Sure to Delete?")){
    this.personData.deletePerson(i);
   }
  }


}
