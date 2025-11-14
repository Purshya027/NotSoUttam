package week1.homework;

public class FibonacciSeries {

	public static void main(String[] args) {
		int maxRange = 8;
		int a = 0;
		int b = 1;
		for (int i = 0; i < maxRange; i++) {
			int c = a+b;
			System.out.println(a);
			a = b;
			b = c;
			
		}

	}

}
