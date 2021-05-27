import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShowComponent } from './show/show.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { NavComponent } from './nav/nav.component';
import { MainComponent } from './main/main.component';
import { AddPersonComponent } from './add-person/add-person.component';
import { ShowPersonComponent } from './show-person/show-person.component';
import { PersonReactiveComponent } from './person-reactive/person-reactive.component';

@NgModule({
  declarations: [
    AppComponent,
    ShowComponent,
    HeaderComponent,
    FooterComponent,
    NavComponent,
    MainComponent,
    AddPersonComponent,
    ShowPersonComponent,
    PersonReactiveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
