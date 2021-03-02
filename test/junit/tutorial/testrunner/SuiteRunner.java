package junit.tutorial.testrunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({junit.tutorial.CalculatorTest.class})
public class SuiteRunner {
	// 空で良い。
	// @SuiteClassesの{ }に、まとめて実行したいテストクラスをガンガン書いていく。
	// 今は1つのテストクラスしかないけど。
}
