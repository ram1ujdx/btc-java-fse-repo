import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

  constructor(private _router:Router) {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    console.log("Request Intercepted");
    let token=sessionStorage.getItem('auth.token');
    if(token){
    request=request.clone({
      setHeaders:{
        Authorization:token
      },
      withCredentials:true
    });
  }
  else{
    this._router.navigate(['/login']);
  }
  

    return next.handle(request);
  }
}
