package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		int num1;
		int num2;
		
		num1=20;
		num2=11;
		
		int Sum = num1 + num2;
		int Multi = num1*num2;
		float Div = (float)num1/num2;
		
		System.out.println("Addition: " + Sum);
		System.out.println("Multiplication: " + Multi);
		System.out.println("Division: " + Div);
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name of user:");
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("Length " + name.length());
		System.out.println("Uppercase " + name.toUpperCase());*/
		
		//------Arrays
		
		int myarray [] = {2,3,45,6,7};
		
		System.out.println("Third value in array: "+ myarray[2]);
		
		String myarray2 []	= {"My","name","is","Ann"};
		
		System.out.println("Second value in array: "+ myarray2[1]);
		
	}

}
