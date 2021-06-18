import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { Credentials } from '../Credentials';
import { PersonApiServiceService } from '../person-api-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _authService:AuthService,private _apiService:PersonApiServiceService, private _router:Router) { }

  ngOnInit(): void {
  }


  login(userCredentials:Credentials){
    sessionStorage.clear();
    this._apiService.login(userCredentials).subscribe(
      response=>{
        console.log(response);
        sessionStorage.setItem("auth.token",response.token);
        this._authService.postLogin(userCredentials.username);
        this._router.navigate(['/show-person']);
      }
    )

  }


}
