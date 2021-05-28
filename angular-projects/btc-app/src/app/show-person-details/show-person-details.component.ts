import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PersonDataService } from '../person-data.service';
import { Person } from '../show/Person';

@Component({
  selector: 'app-show-person-details',
  templateUrl: './show-person-details.component.html',
  styleUrls: ['./show-person-details.component.css']
})
export class ShowPersonDetailsComponent implements OnInit {

  constructor(private _route:ActivatedRoute,private _personData:PersonDataService) { }

  person:Person=new Person();

  ngOnInit(): void {
    this._route.params.subscribe(
      params=>{
        let index=params['id'];
        this.person=this._personData.getPersonDetails(index);
      }
    )
  }

}
