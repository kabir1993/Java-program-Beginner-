package Basic_naztech;

import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius,area;
		System.out.println("enter your radius value :");
		radius = input.nextDouble();
		area = 3.1416*radius*radius;
		System.out.print("The area of the circle is :"+area);
		
	}

}
