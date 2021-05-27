import { AbstractControl } from "@angular/forms";

export function forbiddenNameValidator(control:AbstractControl):{[key:string]:any}|null{

    let forbiddenWord=/kill/.test(control.value);
    return forbiddenWord?{'forbiddenName':{value:control.value}}:null;

}