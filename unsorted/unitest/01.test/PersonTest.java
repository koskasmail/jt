
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

	public PersonTest() {
	}

	@Test
	public void checkAvalue() {
		Person person = new Person();
		assertEquals("test", person.CheckOk());
	}
}
