package junit.turorial.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutExampleTest {
	/** このルールにより、1秒かかったらテストが失敗する */
	@Rule
	public Timeout timeout = new Timeout(1000);
	
	@Test
	public void 長い時間かかるかもしれないテスト() throws Exception {
		// 本来は何かしらのメソッドをテストすること！！
	}

}
