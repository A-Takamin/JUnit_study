package junit.tutorial;

public class Calculator {
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public double devide(int x, int y) {
		if(y == 0) {
			throw new IllegalArgumentException("div/0");
		}
		return (double)x / (double)y;
	}
 }
