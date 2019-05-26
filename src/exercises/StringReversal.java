package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: 
	 *       QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */


	public String reverseMe(String str) {
		
		char [] letterArray = str.toCharArray();
		String forward = "";
		for(int i=letterArray.length-1; i>=0; i--) {
			forward += letterArray[i]; 
	}
	return forward;	
	}
	
	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
		
		System.out.println(reverseMe("QcXgW9w4wQd=v?hctaw/moc.ebutuoy"));
	}
	

}
