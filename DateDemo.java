package Basic_naztech;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date demo = new Date();
		//System.out.println(demo);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		String currentDate = dateFormat.format(demo);
		
		System.out.println("Your current date is :"+currentDate);

	}

}
