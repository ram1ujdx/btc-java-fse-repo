import { Trainee,JavaTrainee } from "./Trainee";

let x:any=5;
let firstName:string;
firstName='Tushar';

x='Rohan';


function add(...arr:number[]):number{

    let sum=0;
    arr.forEach(i=>{
        sum+=i;
    })

    return sum;
  
}

let trainee:Trainee=new JavaTrainee(10001,'Harsh','harsh@gmail.com',11);
trainee.printTrainee();

console.log("Hello BTC");
console.log("Name - "+firstName);
console.log(x);
let sum=add(25,10,20);
console.log(sum);