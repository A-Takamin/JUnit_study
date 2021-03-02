package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static junit.tutorial.IsDate.dateOf;

import java.util.Date;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multiplyで3と4の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}
	@Test
	public void multiplyで5と7の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	}
	@Test
	public void devideで3と2の除算結果が取得できる() {
		Calculator calc = new Calculator();
		double expected = 1.5;
		double actual = calc.devide(3, 2);
		assertThat(actual, is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void devideで5と0のときIllegalArgumentExceptionを投げる() {
		Calculator calc = new Calculator();
		calc.devide(5, 0);
	}
//	@Test
//	public void 日付の比較() throws Exception {
//		Date date = new Date();
//		assertThat(date, is(dateOf(2021, 2, 10)));
//	}
}
