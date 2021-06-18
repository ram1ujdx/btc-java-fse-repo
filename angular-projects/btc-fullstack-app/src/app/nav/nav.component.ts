import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  constructor(public _authService:AuthService) { }

  ngOnInit(): void {

    
        let user:any=sessionStorage.getItem('logged-user');
        if(user){
        this._authService.postLogin(user);
        }
      }
  

  logout(){
    console.log("Signing Out...");
    this._authService.preLogout();
    
  }


}
