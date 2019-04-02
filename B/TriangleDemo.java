package Basic_naztech;

import java.util.Scanner;

public class TriangleDemo {

	public static void main(String[] args) {
		
		System.out.println("Please enter your number:");
		Scanner input =new Scanner(System.in);
		double base,height, result;
		System.out.print("Enter your base :");
		base = input.nextDouble();
		System.out.print("Enter your height :");
		height = input.nextDouble();
		result = (base*height)/2;
		System.out.print("Your result is :"+result);
	}
}
