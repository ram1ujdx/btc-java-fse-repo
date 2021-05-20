// class EmployeeImpl implements Employee{
// employeeId=124554;
// employeeName='Gaurav';
// salary=50000;
// printEmployee(){
//     console.log(this);
// }
// }
var emp1 = {
    employeeId: 124554,
    employeeName: 'Gaurav',
    salary: 50000,
    printEmployee: function () {
        console.log(this);
    }
};
emp1.printEmployee();
