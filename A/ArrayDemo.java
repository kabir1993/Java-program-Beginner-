package Basic_naztech;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int [] number = {10,2,5,-10,6};
		Arrays.sort(number);

		for (int i = 0; i < 6; i++) {
			
			System.out.println("The sorted value is : "+number[i]);
			
		}
	}

}
