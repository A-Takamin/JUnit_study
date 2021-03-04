package junit.tutorial;

public class VerifierExample {
	public int value = 0;
	public void set(int x) {
		this.value = x;
	}
	public void add(int x) {
		this.value += x;
	}
	public void minus(int x) {
		this.value -= x;
	}
	public int getValue() {
		return value;
	}
}
