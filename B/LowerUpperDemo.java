package Basic_naztech;

import java.util.Scanner;

public class LowerUpperDemo {

	public static void main(String[] args) {
		
		char i;
		System.out.println("Enter your character :");
		Scanner input = new Scanner(System.in);
		i = input.next().charAt(0);
		if(i>='a' && i<='z')
		{
			System.out.println("this is small letter.");
			
		}
		else if(i>='A' && i<='Z')
		{
			System.out.println("This is capital letter ");
		}
		

	}

}
