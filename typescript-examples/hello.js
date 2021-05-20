"use strict";
exports.__esModule = true;
var Trainee_1 = require("./Trainee");
var x = 5;
var firstName;
firstName = 'Tushar';
x = 'Rohan';
function add() {
    var arr = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        arr[_i] = arguments[_i];
    }
    var sum = 0;
    arr.forEach(function (i) {
        sum += i;
    });
    return sum;
}
var trainee = new Trainee_1.JavaTrainee(10001, 'Harsh', 'harsh@gmail.com', 11);
trainee.printTrainee();
console.log("Hello BTC");
console.log("Name - " + firstName);
console.log(x);
var sum = add(25, 10, 20);
console.log(sum);
