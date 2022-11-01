package org.tnsindia.junit5demo;


import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestCase_Demo {

	
	@DisplayName("Roman Numerical")
	@ParameterizedTest(name ="\" {0} \" should be {1}")
	@CsvSource({"I,1","II,2"})
	void withNickName(String word, int number)
	{
		
	}
	
	
	
	
	@ParameterizedTest
    @ValueSource(strings={
            "racecar",   
            "radar",
            "able was I ere I saw elba"
    })
    void palindromes(String str) {
        assertTrue(isPalindrome(str));
    }
	
	private void assertTrue(Object palindrome) {
		// TODO Auto-generated method stub
		
	}


	private Object isPalindrome(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	@DisplayName("Demo on ParameterizedTest")
	@ParameterizedTest
	@ValueSource(ints={11,22,33})
	void display( int args)
	{
		assertTrue(args>10);
	}
	

//	@ParameterizedTest
//    @CsvSource({
//            "java,      4",
//            "clojure,   7",
//            "python,    6"
//    })
//    void test_csv(String str, int length) {
//        assertEquals(length, str.length());
//    }
}
