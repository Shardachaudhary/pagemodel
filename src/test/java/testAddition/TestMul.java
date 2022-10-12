package testAddition;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMul {
	
	
@Test
@Parameters({"num1","num2"})

		public void multiplyTwoNum(int firstNum, int secondNum){
		int multiplicationResult;
		
		multiplicationResult = firstNum *secondNum;
			System.out.println("Multiplication of two numbers is: " + multiplicationResult);
		}
/*
@Test
public void printMul() {
	System.out.println("I am inside package testAddition followed by class TestMul");
} */
}
