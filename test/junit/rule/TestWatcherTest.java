package junit.rule;

import static org.junit.Assert.fail;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * テストの様々なタイミングで、以下に定義したメソッドを実行できる
 */
public class TestWatcherTest {

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		
		@Override
		protected void starting (Description des) {
			Logger.getAnonymousLogger().info("start: " + des.getMethodName());
		}
		
		@Override
		protected void succeeded (Description des) {
			Logger.getAnonymousLogger().info("succeeded: " + des.getMethodName());
		}
		
		@Override
		protected void failed (Throwable e, Description des) {
			Logger.getAnonymousLogger().log(Level.WARNING, "failed: " + des.getMethodName());
		}
		
		@Override
		protected void finished (Description des) {
			Logger.getAnonymousLogger().info("finished: " + des.getMethodName());
		}
	};
		
		@Test
		public void 成功するテスト() throws Exception {
			
		}
		
		@Test
		public void 失敗するテスト() throws Exception {
			fail("NG");
		}
}
