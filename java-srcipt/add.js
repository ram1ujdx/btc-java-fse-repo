function add(x,y){
    return x+y;
}

function doAdd(){
    let num1=parseInt(document.getElementById("num1"));
    let num2=parseInt(document.getElementById("num2"));
    let sum=add(num1,num2);
    console.log(num1);
    console.log(num2);
    console.log(sum);
    document.getElementById("sum").innerHTML="Sum = "+sum;


}