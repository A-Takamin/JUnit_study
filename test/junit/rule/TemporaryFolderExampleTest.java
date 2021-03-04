package junit.rule;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import junit.tutorial.TemporaryFolderExample;

public class TemporaryFolderExampleTest {

	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();
	
	@Test
	public void mkDefaultFilesで2つのファイルが作成される() throws Exception{
		File folder = tempFolder.getRoot();
		TemporaryFolderExample.mkDefaultFiles(folder);
		String[] actualFiles = folder.list();
		
		Arrays.sort(actualFiles);
		assertThat(actualFiles.length, is(2));
		assertThat(actualFiles[0], is("UnitTest"));
		assertThat(actualFiles[1], is("readme.txt"));
	}
}
