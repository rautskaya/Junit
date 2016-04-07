package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MyAppTest {

	@BeforeClass
	public static void beforeClass() throws Exception {
	}

	@AfterClass
	public static void afterClass() throws Exception {
	}

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}

	@Test
	public void test_01_assertEquals_Positive() {
		assertEquals("String not the same", "Testing Junit4", App.s);
	}
	
	@Test
	public void test_02_assertEquals_Negative() {
		assertEquals("String not the same", "Testing TestNG6", App.s);
	}
	
	@Ignore
	
	@Test
	public void test_03_assertEquals_Ignored() {
		assertEquals("String not the same", "Testing Junit3", App.s);
	}
	
	@Test
	public void test_04_assertSame_Positive() {
		assertSame("Integer not the same", 33, App.i);
	}
	
	@Test
	public void test_05_assertSame_Negative() {
		assertSame("Integer not the same", 22, App.i);
	}
	
	@Ignore
	
	@Test
	public void test_06_assertSame_Ignored() {
		assertSame("Integer not the same", 11, App.i);
	}
	
	@Test
	public void test_07_assertFalse_Positive() {
		assertFalse("Boolean should be false", App.b);
	}
	
	@Test
	public void test_08_assertFalse_Negative() {
		assertFalse("Boolean should be false", App.a);
	}
	
	@Test
	public void test_09_assertTrue_Positive() {
		assertTrue("Boolean should be true", App.a);
	}
	
	@Test
	public void test_10_assertTrue_Negative() {
		assertTrue("Boolean should be true", App.b);
	}
	
}