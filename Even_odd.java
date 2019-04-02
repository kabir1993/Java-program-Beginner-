package Basic_naztech;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number:");
		Scanner input = new Scanner(System.in);
		int number;
		number = input.nextInt();
		if(number%2==1) {
			
			System.out.println("The number is odd");
		}
		else
		{
			System.out.println("The number is even");
		}

	}

}
