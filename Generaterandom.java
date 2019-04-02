package Basic_naztech;

import java.util.Random;

public class Generaterandom {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int number,i;
		for(i=0;i<10;i++)
		{
			number = rand.hashCode();
			System.out.println(number);	
		}

	}
}
