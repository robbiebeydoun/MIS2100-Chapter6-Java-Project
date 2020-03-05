package Beydoun.Robbie.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath secondSimpleMath = new SimpleMath();
		assert(secondSimpleMath.divide(0,7)== 0);

		
	}
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath thirdSimpleMath = new SimpleMath();
		assert(thirdSimpleMath.divide(1,4) == 0.25);
	
	}
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath fourthSimpleMath = new SimpleMath();
		fourthSimpleMath.divide(6,0);
	}
}


