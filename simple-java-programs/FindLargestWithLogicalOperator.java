import java.util.Scanner;
class FindLargestWithLogicalOperator{
	public static void main(String []args){
		System.out.println("Finding Largest with Logical AND");
		Scanner scanner=new Scanner(System.in);
		int num1, num2,num3;
		System.out.println("Enter three numbers:");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("Num 1 is Largest");
		}
		else if(num2>num3){
				System.out.println("Num 2 is Largest");
		}
		else{
			System.out.println("Num 3 is Largest");
		}		

	}
}