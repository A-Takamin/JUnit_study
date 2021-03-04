package junit.tutorial;

import java.io.File;
import java.io.IOException;

public class TemporaryFolderExample {
	public static void mkDefaultFiles(File folder) throws IOException {
		File f1 = new File(folder.getAbsolutePath()+"/UnitTest");
		File f2 = new File(folder.getAbsolutePath()+"/readme.txt");
		
		f1.createNewFile();
		f2.createNewFile();
	}
}
