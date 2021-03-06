import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import {ShowPersonDetailsComponent} from './show-person-details/show-person-details.component';
import { FooterComponent } from './footer/footer.component';
import { NavComponent } from './nav/nav.component';
import { MainComponent } from './main/main.component';
import { AddPersonComponent } from './add-person/add-person.component';
import { ShowPersonComponent } from './show-person/show-person.component';

import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';
import { AuthInterceptor } from './auth.interceptor';

@NgModule({
  declarations: [
    AppComponent,
    ShowPersonComponent,
    HeaderComponent,
    FooterComponent,
    NavComponent,
    MainComponent,
    AddPersonComponent,
    ShowPersonComponent,
  
    ErrorComponent,
       LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [
    {
      provide:HTTP_INTERCEPTORS,
      useClass:AuthInterceptor,
      multi:true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
