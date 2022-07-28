package com.training.tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	    @DataProvider (name = "data-provider")
	     public Object[][] dpMethod(){
		 return new Object[][] {{"First-Value"}, {"Second-Value"}};
	     }
		
	    @Test (dataProvider = "data-provider")
	    public void myTest (String val) {
	        System.out.println("Passed Parameter Is : " + val);
	    }
	}

/*Note: You need to import the DataProvider in TestNG by adding the line import org.testng.annotations.DataProvider;

In the above code, I am trying to pass the values "First-Value" and "Second-Value" to the Test method "myTest" with the help of the DataProvider method "*dpMethod()".
Note: Unlike parameters in TestNG, the dataproviders can be run directly through the test case file.*/
