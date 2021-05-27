import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { forbiddenNameValidator } from './person-name-validator';

@Component({
  selector: 'app-person-reactive',
  templateUrl: './person-reactive.component.html',
  styleUrls: ['./person-reactive.component.css']
})
export class PersonReactiveComponent implements OnInit {

  personForm = new FormGroup(
    {

    }
  );



  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {

    this.personForm=this.formBuilder.group(
      {
        firstName: ['Rahul',[Validators.required,Validators.minLength(3),forbiddenNameValidator]],
        lastName: ['',[Validators.required,Validators.minLength(3)]],
        email: ['',[Validators.required,Validators.email]],
        age: ['',[Validators.min(12), Validators.max(60)]],
        addressForm:this.formBuilder.group({
          city:['']
          // state:[''],
          // zipCode:['']
        })
      }
    );

  }

  

  get firstName(){
    return this.personForm.get('firstName');
  }
  get lastName(){
    return this.personForm.get('lastName');
  }
  get email(){
    return this.personForm.get('email');
  }
  get age(){
    return this.personForm.get('age');
  }
  get city(){
    return this.personForm.get('addressForm.city');
  }

  // personForm=new FormGroup(
  //   {
  //     firstName:new FormControl('Rahul'),
  //     lastName:new FormControl('Dutta'),
  //     email:new FormControl('rahul@yahoo.com'),
  //     age:new FormControl('25')
  //   }
  // )


}
