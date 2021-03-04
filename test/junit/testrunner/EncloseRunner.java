package junit.testrunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import junit.tutorial.ItemStock;

/**
 * Enclosedタイプのテストランナー
 */
@RunWith(Enclosed.class)
public class EncloseRunner {

	/**
	 * ItemStockのListが空の場合のテストケースを集めた内部クラス
	 * このように、内部クラスでテストをまとめるのも技らしい。
	 */
	public static class 空の場合 {
		ItemStock sut;
		
		@Before
		public void setUp() throws Exception {
			sut = new ItemStock();
		}
		
		@Test
		public void size_Aが0を返す() throws Exception {
			assertThat(sut.size("A"), is(0));
		}
		
		@Test
		public void contains_Aはfalseを返す() throws Exception {
			assertThat(sut.contains("A"), is(false));
		}
	}
	/**
	 * ItemStockのListが商品Aを1つ含むの場合のテストケースを集めた内部クラス
	 */
	public static class 商品Aを1つ含む場合 {
		ItemStock sut;
		
		@Before
		public void setUp() throws Exception {
			sut = new ItemStock();
			sut.add("A");
		}
		
		@Test
		public void size_Aが1を返す() throws Exception {
			assertThat(sut.size("A"), is(1));
		}
		
		@Test
		public void contains_Aはtrueを返す() throws Exception {
			assertThat(sut.contains("A"), is(true));
		}
	}


}
