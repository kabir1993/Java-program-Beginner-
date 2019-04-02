package Basic_naztech;

public class MathDemo {
	
	public static void main(String[] args) {
	
		int x=50;
		int y =60;
		int z=-20;
		int max = Math.max(x, y);
		System.out.println("the maximum number is :" +max);
		int min = Math.min(x, y);
		System.out.println("the minimum number is :" +min);
		int abs = Math.abs(z);
		System.out.println("the absolute number is :" +abs);
		System.out.println(Math.PI);
	}
}
