import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPersonComponent } from './add-person/add-person.component';
import { ErrorComponent } from './error/error.component';
import { ShowPersonDetailsComponent } from './show-person-details/show-person-details.component';

import { ShowPersonComponent } from './show-person/show-person.component';

const routes: Routes = [
  {
    path:'add-person', component:AddPersonComponent
  },
  {
    path:'show-person', component:ShowPersonComponent
  },
  {
    path:'show-person/:person-name', component:ShowPersonDetailsComponent
  },
  {
    path:'error', component:ErrorComponent
  },
  {
    path:'**',redirectTo:'/error'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
