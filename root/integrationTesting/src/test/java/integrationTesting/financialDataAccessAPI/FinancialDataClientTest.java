package integrationTesting.financialDataAccessAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dataAccess.IEXCloud;

 
 
 
 
 
public class FinancialDataClientTest {
		
 		
 		private IEXCloud classUnderTest = new IEXCloud();
		

 	    @Test
 	    void testAddition() {

 	    	int actual = classUnderTest.testMe();
 	    	
 	    	int expected = 0;
 	    	
 	    	assertEquals(expected,actual);
 	    	
 	    }
 	    
 	
 	}