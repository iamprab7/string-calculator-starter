package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    
    
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
      }

  	@Test
  	public void testEmptyString() {
  		StringCalculator stringCalculator = new StringCalculator();
  		assertEquals(0, StringCalculator.add(""));
  	}

  	@Test
  	public void testOneNumber() {
  		StringCalculator stringCalculator = new StringCalculator();
  		assertEquals(1, stringCalculator.add("1"));
  	}

  	@Test
  	public void testTwoNumbers(){
  		StringCalculator stringCalculator = new StringCalculator();
  		assertEquals(3, stringCalculator.add("1,2"));
  	}

  	@Test
      public void testThreeNumbers(){
  		StringCalculator stringCalculator = new StringCalculator();
      	assertEquals(6, stringCalculator.add("1,2,3"));
      }

      @Test
      public void testNewLine(){
    	  StringCalculator stringCalculator = new StringCalculator();
      	assertEquals(6, stringCalculator.add("1\n2,3"));
      }

      @Test
      public void testNegativeNumver(){
    	  StringCalculator stringCalculator = new StringCalculator();
      	try {
  			stringCalculator.add("-1,2");
  		}
  		catch (IllegalArgumentException e){
  			assertEquals(e.getMessage(), "Negatives not allowed: -1");
  		}

  		try {
  			stringCalculator.add("2,-4,3,-5");
  		}
  		catch (IllegalArgumentException e){
  			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
  		}
      }

      @Test
      public void testOverThousand(){
    	  StringCalculator stringCalculator = new StringCalculator();
      	assertEquals(2, stringCalculator.add("1000,2"));
      }

      @Test
      public void testOtherDelimiter(){
    	  StringCalculator stringCalculator = new StringCalculator();
      	assertEquals(3, stringCalculator.add("//;\n1;2"));
      }
    
}
