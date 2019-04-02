package Basic_naztech;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		
		int n1,n2,r;
		
	
		System.out.println("enter your number:");
		Scanner v1 = new Scanner(System.in);
		n1=v1.nextInt();
		//System.out.println(n1);
		
		System.out.println("enter your number:");
		n2=v1.nextInt();
		//System.out.println(n2);
		r= n1 + n2;
		//System.out.println(r);
		System.out.println("sum is "+r);

	}

}
