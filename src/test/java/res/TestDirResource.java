package res;

import java.io.IOException;

import org.junit.Test;

public class TestDirResource {

	@Test
	public void test() {
		DirResource dir = new DirResource();
		
		try {
			System.out.println(dir.dirJSon("toto"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}