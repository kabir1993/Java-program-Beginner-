package Basic_naztech;

import java.util.Scanner;

public class FarenheitDemo {

	public static void main(String[] args) {
		double farenheit,celcius,f,c;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter your celcius value :");
		celcius = input.nextDouble();
		f = (9*celcius)/5+32;
		System.out.println("The farenheit result is :"+f);
		System.out.print("Enter your farenheit value :");
		farenheit = input.nextDouble();
		c = (5*(farenheit-32))/9;
		System.out.print("the celcius result is :"+c);

	}

}
