import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {

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
	public void reverseStringBigTest() {
		//use alice in wonderland txt
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
