package validParentheses;

import static org.junit.Assert.*;

import org.junit.Test;

public class validParenthesesTest {

	@Test
	public void test0() {
		assertFalse(validParentheses.isValid(""));
	}
	
	@Test
	public void test1(){
		assertFalse(validParentheses.isValid("("));
	}
	
	@Test 
	public void test2() {
		assertTrue(validParentheses.isValid("()"));
	}
	
	@Test
	public void test3() {
		assertTrue(validParentheses.isValid("{}"));
	}
	
	@Test
	public void test4() {
		assertTrue(validParentheses.isValid("[]"));
	}
	
	@Test 
	public void test5() {
		assertFalse(validParentheses.isValid("(){"));
	}
	
	@Test 
	public void test6() {
		assertTrue(validParentheses.isValid("(){}"));
	}
	
	@Test 
	public void test7() {
		assertTrue(validParentheses.isValid("(){}[]()"));
	}
	
	@Test 
	public void test8() {
		assertFalse(validParentheses.isValid("(){}[]()["));
	}
}
