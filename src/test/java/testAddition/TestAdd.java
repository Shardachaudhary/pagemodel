package testAddition;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAdd {

	@Test
	@Parameters({"n1","n2"})
	public void addTwoNum(int num1, int num2){
		int total;
		total = num1+num2;
		System.out.println("Sum of two numbers is: " + total);
	}
	
	/*
	 * @Test 
	 * public void printAdd() 
	 * { System.out.println("I am inside package testAddition followed by class TestAdd"); }
	 */
}
