interface Employee{
    employeeId:number;
    employeeName:string;
    salary:number;

    printEmployee():void;

}

// class EmployeeImpl implements Employee{

    // employeeId=124554;
    // employeeName='Gaurav';
    // salary=50000;
    // printEmployee(){
    //     console.log(this);
    // }

// }

let emp1:Employee={
    employeeId:124554,
    employeeName:'Gaurav',
    salary:50000,
    printEmployee(){
        console.log(this);
    }
}
emp1.printEmployee();