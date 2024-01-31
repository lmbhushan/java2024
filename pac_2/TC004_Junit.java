package pac_2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC004_Junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before the class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after the class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before class");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is after class");
	}

	@Test
	public void test1() {
		System.out.println("This is the test1");
	}
	@Test
	public void test2() {
		System.out.println("This is the test2");
	}
	

}
