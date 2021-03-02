package junit.tutorial.testrunner;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategoriesTest {

	@Test
	public void カテゴリAに所属していないテスト() {
		
	}
	
	@Test
	@Category(CategoryA.class)
	public void カテゴリAテスト() {
		
	}

}
