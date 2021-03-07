package junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.RuleChain;

public class RuleChainExampleTest {

	@Rule
	public RuleChain ruleChain = RuleChain.outerRule(new DBServer())
												  .around(new AppServer());
	@Test
	public void test() {
		
	}
}

class AppServer extends ExternalResource {
	@Override
	protected void before() throws Throwable {
		System.out.println("start AP");
	}
	@Override
	protected void after() {
		System.out.println("shutdown AP");
	}
}

class DBServer extends ExternalResource {
	@Override
	protected void before() throws Throwable {
		System.out.println("start DB");
	}
	@Override
	protected void after() {
		System.out.println("shutdown DB");
	}
}
