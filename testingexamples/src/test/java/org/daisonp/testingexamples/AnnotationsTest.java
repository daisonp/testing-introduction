package org.daisonp.testingexamples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnnotationsTest {

	@BeforeClass
	public static void setUpBeforeClass()  {
		System.out.println("@BeforeClass will be run once at the start before any of the tests");
	}

	@AfterClass
	public static void tearDownAfterClass()  {
		System.out.println("@AfterClass will be run once at the end of all the tests");
	}

	@Before
	public void setUp()  {
		System.out.println("@Before runs before each test is executed");
	}

	@After
	public void tearDown(){
		System.out.println("@After runs after each test is executed");
	}

	@Test
	public void test_1() {
		System.out.println("This is test 1");
	}

	@Test
	public void test_2() {
		System.out.println("This is test 2");
	}
	
	@Test @Ignore
	public void test_3() {
		System.out.println("This is test 3, the test is being ignored");
	}
}
