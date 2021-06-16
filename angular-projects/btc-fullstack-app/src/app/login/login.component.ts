import { Component, OnInit } from '@angular/core';
import { Credentials } from '../Credentials';
import { PersonApiServiceService } from '../person-api-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _apiService:PersonApiServiceService) { }

  ngOnInit(): void {
  }


  login(userCredentials:Credentials){

    this._apiService.login(userCredentials).subscribe(
      response=>{
        console.log(response);
        sessionStorage.setItem("auth.token",response.token);
      }
    )

  }


}
