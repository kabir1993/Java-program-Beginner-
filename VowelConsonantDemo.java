package Basic_naztech;

import java.util.Scanner;

public class VowelConsonantDemo {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("Enter your lettwer:");
		Scanner input = new Scanner(System.in);
		ch = input.nextLine().charAt(0);
		if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'||ch=='u')
		{
			System.out.println("This is vowel.");
		}
		else
		{
		System.out.println("This is consonant.");
		}

	}

}
