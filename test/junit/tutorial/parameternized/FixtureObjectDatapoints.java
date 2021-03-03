package junit.tutorial.parameternized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import junit.tutorial.Calculator;
@RunWith(Theories.class)
public class FixtureObjectDatapoints {

	@DataPoints
	public static Fixture[] PARAMs = {
			new Fixture(3, 4, 7),
			new Fixture(4, 5, 9)
	};
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
