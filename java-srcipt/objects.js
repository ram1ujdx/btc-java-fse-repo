let trainee={
    traineeName:"Rahul",
    email:"rahul@yahho.com",
    age:25,
    showTrainee() {
        console.log(this);
    }
};

trainee.technology="Java";

trainee.showTrainee(this);