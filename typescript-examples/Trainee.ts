export class Trainee{
   constructor(protected traineeId:number, protected traineeName:string, protected email:string){ }

   
    public printTrainee():void{
        console.log(this);
    }


}

export class JavaTrainee extends Trainee{

    private javaVersion:number;

    constructor(traineeId:number,  traineeName:string, email:string,javaVersion:number){
        super(traineeId,  traineeName, email);
        this.javaVersion=javaVersion;
    }

    public printTrainee():void{
        console.log(this);
    }

}


let trainee:Trainee=new Trainee(1001,'Tushar','tushar@yahoo.com');

trainee.printTrainee();

let trainee2:Trainee=new JavaTrainee(1002,'Rohit','rohit@yahoo.com',8);
trainee2.printTrainee();