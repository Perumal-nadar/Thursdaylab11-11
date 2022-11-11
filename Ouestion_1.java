package ThursdayLab_11_11;

import java.util.Scanner;
//Write a aprograme to performe a swapping of two number with third variable and with out third variable?
public class Ouestion_1 {
	int num1,num2,temp;//Instance variable.....
	public static void main(String[] args) {
		Ouestion_1 obj=new Ouestion_1();
		obj.accept();// method to call a non-Static function.

	}
	public void accept()// Accepting values from the user.
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		Swapp_without(num1,num2);
		Swapp_with(num1,num2);
	}
	public void Swapp_without(int num1,int num2)// swaps with out using a third variable.
	{

		System.out.println(" The numbers are:");
		System.out.println("num1:"+num1+" and num2:"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swapping the numbers are:");
		System.out.println("num1:"+num1+" and num2:"+num2);
		
	}
	public void Swapp_with(int num1,int num2)
	{
		System.out.println(" The numbers are:");
		System.out.println("num1:"+num1+" and num2:"+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping the numbers are:");
		System.out.println("num1:"+num1+" and num2:"+num2);
		
	}

}
