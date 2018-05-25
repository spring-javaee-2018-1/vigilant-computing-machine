package exemple.hello;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

	@Test
	public void testApp() {
		String expected = "Hello, World!";
		String actual = App.getGreeting();
		assertTrue(expected.equals(actual));
	}
}
