package arraypackage;
import java.util.Scanner;
public class Calculator 
{
	void add(int x,int y)
	{
		int sum=x+y;
		System.out.println("Addition of "+x+" and "+y+" is : "+sum);
	}
	void sub(int x,int y)
	{
		int diff=x-y;
		System.out.println("Subtraction of "+x+" and "+y+" is : "+diff);
	}	
	void mul(int x,int y)
	{
		double mul=x*y;
		System.out.println("Multiplication of "+x+" and "+y+" is : "+mul);
	}
	void div(int x,int y)
	{
		if(y!=0) 
		{
			double div=(double)(x)/y;
			System.out.println("Division of "+x+" and "+y+" is : "+div);
		}
		else
		{
			System.out.println("Division with 0 is not possible !!!");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Calculator calc = new Calculator();
		char repeat;
		System.out.println("---CALCULATOR---");
		do
		{
			System.out.println("Enter the first number : ");
			int num1=sc.nextInt();
			System.out.println("Enter the second number : ");
			int num2=sc.nextInt();
			
			System.out.println("Enter your choice(1-4) : \n-----------------------");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				calc.add(num1, num2);
				break;
			case 2:
				calc.sub(num1, num2);
				break;
			case 3:
				calc.mul(num1, num2);
				break;
			case 4:
				calc.div(num1, num2);
				break;
			default:
				System.out.println("Enter the correct choice (1-4)");
				
			}
			System.out.println("\nDo you want to continue(Y/N)? : ");
			repeat=sc.next().charAt(0);
		
		}while(repeat=='y' || repeat=='Y');
		System.out.println("Calculator Closed");
	}
}