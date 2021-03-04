package junit.rule;

import org.junit.Rule;
import org.junit.rules.ExternalResource;

import junit.tutorial.Server;

/**
 * ExternalResouceはテスト用に何かリソースを作成するときに使う。
 */
public class ExternalResourceTest {

	@Rule
	public ServerResource resource = new ServerResource();
	
	static class ServerResource extends ExternalResource {
		Server server;
		
		@Override
		protected void before() throws Exception {
			server = new Server(8080);
			server.start();
		}
		
		@Override
		protected void after() {
			server.shutdown();
		}
	}
}
