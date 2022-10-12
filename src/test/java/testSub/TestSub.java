package testSub;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSub {
	@AfterTest
	public void subTwoNum(){
		int num1 =5, num2 = 4, difference;
		difference = num1-num2;
		System.out.println("after test, Difference of two numbers is: " + difference);
	}
	
@BeforeTest
	public void printSub() {
		System.out.println("before test, I am inside package testSub followed by class TestSub");
	}
}
