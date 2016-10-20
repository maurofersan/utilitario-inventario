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

import com.mauro.utilitario.util.StringUtil;

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
		assertEquals(StringUtil.capitalize("java"), "Java");
		assertEquals(StringUtil.capitalize(""), "");
		assertTrue(StringUtil.capitalize("h").equals("H"));
		assertNull(StringUtil.capitalize(null));
	}

	@Test
	public void truncateTest() {
		System.out.println("truncateTest()");
		assertEquals(StringUtil.truncate("", 2), "");
		assertTrue(StringUtil.truncate("java", 10).equals("java"));
		assertNull(StringUtil.truncate(null, 1));
	}

	@Test
	public void timesTest() {
		System.out.println("timesTest()");
		assertEquals(StringUtil.times("", 2), "");
		assertTrue(StringUtil.times("java", 2).equals("javajava"));
		assertNull(StringUtil.times(null, 2));
	}
	@Test
	public void reverseTest() {
		System.out.println("reverseTest()");
		assertEquals(StringUtil.reverse("hello"), "olleh");
		assertTrue(StringUtil.reverse("").equals(""));
		assertNull(StringUtil.reverse(null));
	}
	@Test
	public void capitalizeAllWordsTest() {
		System.out.println("capitalizeAllWordsTest()");
		assertEquals(StringUtil.capitalizeAllWords("  hello   world1"), "  Hello   World1");
		assertTrue(StringUtil.capitalizeAllWords("").equals(""));
		assertNull(StringUtil.capitalizeAllWords(null));
	}
	@Test
	public void swapCaseTest() {
		System.out.println("swapCaseTest()");
		assertEquals(StringUtil.swapCase(""), "");
		assertTrue(StringUtil.swapCase(" hW  a").equals(" Hw  A"));
		assertNull(StringUtil.swapCase(null));
	}
	@Test
	public void fullTrim() {
		System.out.println("fullTrim()");
		assertEquals(StringUtil.fullTrim(" h    1w   q"), "h 1w q");
		assertTrue(StringUtil.fullTrim("").equals(""));
		assertNull(StringUtil.fullTrim(null));
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
		assertEquals(StringUtil.containsIgnoreCase("MAu ro", "ma"),true);
		assertTrue(StringUtil.containsIgnoreCase("Kola Real", "rEa"));
		assertEquals(StringUtil.containsIgnoreCase("ma", null), false);
		assertEquals(StringUtil.containsIgnoreCase(null, null), false);
	}
}
