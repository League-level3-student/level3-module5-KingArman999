package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(30, RecursionMath.recursiveMultiplication(5, 6));
        assertEquals(0, RecursionMath.recursiveMultiplication(5, 0));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(2, RecursionMath.recursiveDivision(6, 3));
    	assertEquals(4, RecursionMath.recursiveDivision(12, 3));
    	assertEquals(6, RecursionMath.recursiveDivision(6, 1));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(6, RecursionMath.recursivePower(6, 1));
    	assertEquals(1, RecursionMath.recursivePower(12, 0));
    	assertEquals(36, RecursionMath.recursivePower(6, 2));
    	assertEquals(8, RecursionMath.recursivePower(2, 3));
   }
}
