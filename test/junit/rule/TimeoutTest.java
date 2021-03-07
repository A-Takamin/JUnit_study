package junit.rule;

import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * タイムアウト
 */
public class TimeoutTest {

	@Test(timeout = 100L)
	public void test() throws Exception {
		// test
	}
}