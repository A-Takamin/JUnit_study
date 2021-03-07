package junit.rule;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.tutorial.ShopInfo;

public class ErrorCollectorTest {

	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	@Test
	public void デフォルトコンストラクタ() throws Exception {
		// Exercise
		ShopInfo instance = new ShopInfo();
		// Verify
		ec.checkThat(instance, is(notNullValue()));
		ec.checkThat(instance.id, is(nullValue()));
		ec.checkThat(instance.name, is(""));
		ec.checkThat(instance.address, is(""));
		ec.checkThat(instance.url, is(nullValue()));
	}

}
