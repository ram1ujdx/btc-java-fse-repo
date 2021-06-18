import { Injectable, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
loggedInUser!:string;
isLoggedIn!:boolean;

  constructor(private _router:Router) { }

  preLogout(){
    this.loggedInUser='';
    this.isLoggedIn=false;
    sessionStorage.clear();
    this._router.navigate(['/login']);
  }

  postLogin(username:any){
    this.loggedInUser=username;
    sessionStorage.setItem("logged-user",username);
    this.isLoggedIn=true;
   
  }

}
