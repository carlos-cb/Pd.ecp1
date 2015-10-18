package Factory.NaturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactoryNaturalNumberTest {

	private NaturalNumberManager naturalNumberManager;
	
	@Before
	public void before(){
		naturalNumberManager = new NaturalNumberManager();
	}
	
	@Test
	public void testSetValue(){
		naturalNumberManager.getNaturalNumber().setValue(1);
		assertEquals(1,naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("uno",naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void testES() {
		naturalNumberManager.setCreator(new NaturalNumberESCreator());
		naturalNumberManager.creatnaturalNumber();
		naturalNumberManager.getNaturalNumber().setValue(2);
		assertEquals(2,naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("dos",naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void testEN() {
		naturalNumberManager.setCreator(new NaturalNumberENCreator());
		naturalNumberManager.creatnaturalNumber();
		naturalNumberManager.getNaturalNumber().setValue(3);
		assertEquals(3,naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("three",naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void testFR() {
		naturalNumberManager.setCreator(new NaturalNumberFRCreator());
		naturalNumberManager.creatnaturalNumber();
		naturalNumberManager.getNaturalNumber().setValue(4);
		assertEquals(4,naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("quatre",naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void testSuma() {
		naturalNumberManager.getNaturalNumber().add(1);
		assertEquals(1, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("uno", naturalNumberManager.getNaturalNumber()
				.getTextValue());
	}

}
