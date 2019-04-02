package Basic_naztech;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		
		int number ;
		System.out.println("Please enter a number :");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		if(number>0) {
			
			System.out.print("Your number is positive");
		}
		else 
			System.out.print("your number is negetive");
		

	}

}
