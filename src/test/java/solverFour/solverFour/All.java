package solverFour.solverFour;

import static org.junit.Assert.*;

import org.junit.Test;

public class All {

	codingBat codingBat = new codingBat();
	@Test
	public void oneTwoTest() {
		
	

	
	assertEquals("", codingBat.oneTwo(""));
	assertEquals("bca", codingBat.oneTwo("abc"));
	assertEquals("cat", codingBat.oneTwo("tca"));
  	assertEquals("catdog", codingBat.oneTwo("tcagdo"));
	assertEquals("231564897", codingBat.oneTwo("1234567890"));
	assertEquals("bcaefd", codingBat.oneTwo("abcdefxy"));
	assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564", codingBat.oneTwo("abcdefghijklkmnopqrstuvwxyz12345678"));
	assertEquals("", codingBat.oneTwo("xy"));
	

	
	}

//@Test
public void zipZapTest() {
	

	
	//assertEquals("zpXzp", codingBat.zipZap("zipXzap"));
	assertEquals("azbcpzp", codingBat.zipZap("azbcpzpp"));
	
}

//@Test 
public void starOutTest() {
//	assertEquals("ad", codingBat.starOut("ab*cd"));
//	assertEquals("ad", codingBat.starOut("ab**cd"));
//	assertEquals("string", codingBat.starOut("stringy*"));
//	assertEquals("tringy", codingBat.starOut("*stringy"));
	
	
	
//	assertEquals("ad", codingBat.starOut2("ab*cd"));
//	assertEquals("ad", codingBat.starOut2("ab**cd"));
//	assertEquals("string", codingBat.starOut2("stringy*"));
//	assertEquals("tringy", codingBat.starOut2("*stringy"));
//	assertEquals("siy", codingBat.starOut2("sm*eil*ly"));
//	assertEquals("", codingBat.starOut2("a*b"));
//	assertEquals("a", codingBat.starOut2("a"));


	
	
}
//@Test 
public void plusOut() {
	
//	assertEquals("++xy++", codingBat.plusOut("12xy34", "xy"));
//	assertEquals("1+++++", codingBat.plusOut("12xy34", "1"));
//	assertEquals("++xy++xy+++xy", codingBat.plusOut("12xy34xyabcxy", "xy"));
//	assertEquals("++++abc+++", codingBat.plusOut("abXYabcXYZ", "abc"));

	
	
}


@Test
public void wordEnds() {
	
	
//	assertEquals("c13i", codingBat.wordEnds("abcXY123XYijk", "XY"));
//	assertEquals("13", codingBat.wordEnds("XY123XY", "XY"));
//	assertEquals( "11", codingBat.wordEnds("XY1XY", "XY"));
//	assertEquals( "", codingBat.wordEnds("XY", "XY"));
//	assertEquals( "cxziij", codingBat.wordEnds("abc1xyz1i1j", "1"));
//	assertEquals( "cxz11", codingBat.wordEnds("abc1xyz11", "1"));	
	assertEquals( "11", codingBat.wordEnds("abc1xyz1abc", "abc"));	





}


}
