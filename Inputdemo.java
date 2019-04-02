package Basic_naztech;

import java.util.Scanner;

public class Inputdemo {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	int number;
	System.out.println("print any number:");
	number = input.nextInt();


	
	String name;
	System.out.println("Enter your name: ");
	Scanner input1 = new Scanner(System.in);
	name = input1.nextLine();
	System.out.println("name is:  " +name);
	}

}
