package junit.tutorial.parameternized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import junit.tutorial.Calculator;
@RunWith(Theories.class)
public class FixtureObjectDatapoint {

	@DataPoint
	public static Fixture PARAM_1 = new Fixture(3, 4, 7);
	@DataPoint
	public static Fixture PARAM_2 = new Fixture(4, 5, 9);
	/**
	 * データを渡しやすいようにFixtureクラスを定義した
	 */
	static class Fixture {
		int x;
		int y;
		int expected;
		
		Fixture(int x, int y, int expected) {
			this.x = x;
			this.y = y;
			this.expected = expected;
		}
	}
	
	@Theory
	public void add(Fixture f) {
		Calculator c = new Calculator();
		assertThat(c.add(f.x, f.y), is(f.expected));
	}

}
