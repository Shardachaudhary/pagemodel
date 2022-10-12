package testSub;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDiv {
	
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod()
	{
	 return new Object[][] {{100, 20}, {10, 5}, {18,2}};
	}
	 
	 
	@Test (dataProvider = "data-provider")
	public void divTwoNum(int number1, int number2){
		int division;
		division = number1/number2;
		System.out.println("Division of two numbers is: " + division);
	}
	/*
	 * @Test public void printDiv() {
	 * System.out.println("I am inside package testSub followed by class TestDiv");
	 * }
	 */
}
