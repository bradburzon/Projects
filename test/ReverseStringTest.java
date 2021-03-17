import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
	
	static ReverseString alice;
	static String rsAlice;
	
	@BeforeAll
	public static void setUpReverseAlice() throws FileNotFoundException {
		//setup Alice in wonderland txt
		File aliceTxt = new File("C:\\Users\\bradb\\Documents\\Projects\\test\\txt-files\\alicewonder.txt");
		alice = new ReverseString(aliceTxt);
		
		//Reversed alice in wonderland using String function from string-functions.com/reverse.aspx
		File aliceReversed = new File("C:\\Users\\bradb\\Documents\\Projects\\test\\txt-files\\alicereverse(stringfunctions.com).txt");
		Scanner sc = new Scanner(aliceReversed);
		rsAlice = "";
		while(sc.hasNext()) {
			rsAlice += sc.nextLine();
		}
		sc.close();
	}
	

	@Test
	public void testDefaultConstructor() {
		ReverseString rs = new ReverseString();
		assertEquals("", rs.getStr());
		rs.reverseString(rs.getStr());
		assertEquals("", rs.getReversedString());
	}

	@Test
	public void reverseStringSmallTest() {
		ReverseString rs = new ReverseString("Hello, There");
		assertEquals("Hello, There", rs.getStr());
		rs.reverseString(rs.getStr());
		assertEquals("erehT ,olleH", rs.getReversedString());

		rs = new ReverseString("How DO you LIKE this WEATHER?");
		assertEquals("How DO you LIKE this WEATHER?", rs.getStr());
		rs.reverseString(rs.getStr());
		assertEquals("?REHTAEW siht EKIL uoy OD woH", rs.getReversedString());

		rs = new ReverseString("This is part of the small test used for reverse string.");
		assertEquals("This is part of the small test used for reverse string.", rs.getStr());
		rs.reverseString(rs.getStr());
		assertEquals(".gnirts esrever rof desu tset llams eht fo trap si sihT", rs.getReversedString());
	}

	@Test 
	public void secondReverseStringTest() {
		ReverseString rs = new ReverseString("Hello, There");
		assertEquals("Hello, There", rs.getStr());
		rs.reverseString2(rs.getStr());
		assertEquals("erehT ,olleH", rs.getReversedString());

		rs = new ReverseString("How DO you LIKE this WEATHER?");
		assertEquals("How DO you LIKE this WEATHER?", rs.getStr());
		rs.reverseString2(rs.getStr());
		assertEquals("?REHTAEW siht EKIL uoy OD woH", rs.getReversedString());

		rs = new ReverseString("This is part of the small test used for reverse string.");
		assertEquals("This is part of the small test used for reverse string.", rs.getStr());
		rs.reverseString2(rs.getStr());
		assertEquals(".gnirts esrever rof desu tset llams eht fo trap si sihT", rs.getReversedString());
	}

	@Test
	public void reverseStringBigTest() throws FileNotFoundException {
		assertEquals(rsAlice, alice.reverseString(alice.getStr()));
	}
	
	@Test
	public void secondReverseStringBigTest() {
		assertEquals(rsAlice, alice.reverseString2(alice.getStr()));
	}

}
