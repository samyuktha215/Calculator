package CalculatorProject.Calculator;

import CalculatorProject.Calculator.Model.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {
private Calculator calculator;
@BeforeEach
public void setup(){
	calculator=new Calculator();
}
	@Test
	public void testAddFunctionWhenGivenTwoNumbers() {
	//Given
		int a= 3,b=2;
	//When
		int result=calculator.add(a,b);
	//Then
     assertEquals(5,result);

	}
	@Test
	public void testMinusFunctionWhenGivenTwoNumbers() {
		//Given
		int a= 3,b=2;
		//When
		int result=calculator.subtract(a,b);
		//Then
		assertEquals(1,result);

	}
	@Test
	public void testProductFunctionWhenGivenTwoNumbers() {
		//Given
		int a= 3,b=2;
		//When
		int result=calculator.multiply(a,b);
		//Then
		assertEquals(6,result);

	}
	@Test
	public void testDividingFunctionWhenGivenTwoNumbers() {
		//Given
		int a= 4,b=2;
		//When
		int result=calculator.divide(a,b);
		//Then
		assertEquals(2,result);

	}


}
