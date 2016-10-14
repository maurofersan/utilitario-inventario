package com.mauro.utilitario.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame;

//import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;

import com.mauro.utilitario.util.StringUtil1;

//@Ignore("Ignorado por no haber terminado aun")
public class StrinUtilTest1 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("------------->beforeClass()");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("------------->afterClass()");
	}
//	@Before
//	public void before() {
//		System.out.println(">>>>>before()");
//	}
//	@After
//	public void after(){
//		System.out.println(">>>>>after()");
//	}
//	@Ignore
	@Test
	public void capitalizeTest() {
		System.out.println("capitalizeTest()");
		assertEquals(StringUtil1.capitalize("java"), "Java");
		assertEquals(StringUtil1.capitalize(""), "");
		assertTrue(StringUtil1.capitalize("h").equals("H"));
		assertNull(StringUtil1.capitalize(null));
	}

	@Test
	public void truncateTest() {
		System.out.println("truncateTest()");
		assertEquals(StringUtil1.truncate("", 2), "");
		assertTrue(StringUtil1.truncate("java", 10).equals("java"));
		assertNull(StringUtil1.truncate(null, 1));
	}

	@Test
	public void timesTest() {
		System.out.println("timesTest()");
		assertEquals(StringUtil1.times("", 2), "");
		assertTrue(StringUtil1.times("java", 2).equals("javajava"));
		assertNull(StringUtil1.times(null, 2));
	}
	@Test
	public void reverseTest() {
		System.out.println("reverseTest()");
		assertEquals(StringUtil1.reverse("hello"), "olleh");
		assertTrue(StringUtil1.reverse("").equals(""));
		assertNull(StringUtil1.reverse(null));
	}
	@Test
	public void capitalizeAllWordsTest() {
		System.out.println("capitalizeAllWordsTest()");
		assertEquals(StringUtil1.capitalizeAllWords("  hello   world1"), "  Hello   World1");
		assertTrue(StringUtil1.capitalizeAllWords("").equals(""));
		assertNull(StringUtil1.capitalizeAllWords(null));
	}
	@Test
	public void swapCaseTest() {
		System.out.println("swapCaseTest()");
		assertEquals(StringUtil1.swapCase(""), "");
		assertTrue(StringUtil1.swapCase(" hW  a").equals(" Hw  A"));
		assertNull(StringUtil1.swapCase(null));
	}
	@Test
	public void fullTrim() {
		System.out.println("fullTrim()");
		assertEquals(StringUtil1.fullTrim(" h    1w   q"), "h 1w q");
		assertTrue(StringUtil1.fullTrim("").equals(""));
		assertNull(StringUtil1.fullTrim(null));
	}
	@Test
	public void assetSameAndEqualsTest() {
		String cadena1 = "java";
		String cadena2 = "java";
		String cadena3 = new String("java");
		assertSame(cadena1, cadena2);
		assertEquals(cadena1, cadena3);
	}
	@Test
	public void containsIgnoreCaseTest() {
		System.out.println();
		assertEquals(StringUtil1.containsIgnoreCase("MAu ro", "ma"),true);
		assertTrue(StringUtil1.containsIgnoreCase("Kola Real", "rEa"));
		assertEquals(StringUtil1.containsIgnoreCase("ma", null), false);
		assertEquals(StringUtil1.containsIgnoreCase(null, null), false);
	}
}
