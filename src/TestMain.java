/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Testing
 * Lecture  : http://youtu.be/LMa0sFS2Bvw
 * Tutorial : http://youtu.be/-NsVAcpvSgc
 * License  : None.  Do with it as you wish! :)
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMain {

	@Test
	public void test() {
		Main test = new Main();
		
		assertEquals("1+1=2", 3, test.add(1, 1));
	}

}
