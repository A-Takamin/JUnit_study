package junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 例外メッセージまでも検証したい場合。
 */
public class ExpectedExceptionTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	@Test
	public void 例外の発生とメッセージを検証するテスト() throws Exception {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("argument is null");
		
		throw new IllegalArgumentException();
	}

}
