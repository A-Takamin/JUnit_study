package junit.testrunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import junit.tutorial.Calculator;

@RunWith(Theories.class)
public class TheoriesRunner {

	@DataPoints
	public static int[][] VALUES = 
	{
		{0, 0, 0},
		{0, 1, 1},
		{1, 0, 1},
		{3, 4, 7},
//		{2, 4, 7}, // エラー
	};
	
	/**
	 * 配列の1番目 + 2番目 = 3番目であることをテストしている
	 * @param values
	 */
	@Theory
	public void add(int[] values) throws Exception {
		Calculator sut = new Calculator();
		assertThat(sut.add(values[0], values[1]), is(values[2]));
	}

}
