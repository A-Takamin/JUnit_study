package junit.rule;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest2 {
	@Rule
	public Timeout timeout = new Timeout(100);
	
	@Test
	public void test() throws Exception {
		// 
	}
}