package junit.testrunner;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(CategoryA.class)
@SuiteClasses(CategoriesTest.class)
public class CategoriesRunner {
}
