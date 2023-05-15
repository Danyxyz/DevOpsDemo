package ch.zhaw.iwi.devops.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

	@Test
	public void addPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(3,5,'+');
		Assertions.assertEquals(8, result);
	}

	@Test
	public void subtractPositiveNumeber() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(8,3,'-');
		Assertions.assertEquals(5, result);
	}

	@Test
	public void multiplayPositiveNumbers() {
		Calculator calculator= new Calculator();
		int result = calculator.processNumbers(3, 5, '*');
		Assertions.assertEquals(15,result); 
	}

	@Test
	public void dividePositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(10, 2, '/');
		Assertions.assertEquals(5, result);
		}

	@Test
	public void moduloOperation() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(10, 3,'%');
		Assertions.assertEquals(1, result);
	} 

	@Test
	public void maxPositiveInteger() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(Integer.MAX_VALUE, 1, '-');
		Assertions.assertEquals(Integer.MAX_VALUE - 1, result);
	}

	@Test
	public void addOppositeNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(5, -5, '+');
		Assertions.assertEquals(0, result);
	}

	@Test
	public void square() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(5, 0, 's');
		Assertions.assertEquals(25, result);

	}

	@Test
	public void absoluteDifference() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(5, 10, 'a');
		Assertions.assertEquals(5, result);
	}

	@Test
	public void maxNumber() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(5, 10, 'm');
		Assertions.assertEquals(10, result);
	}

	//adding test to see differences in jacoco
	@Test
	public void addPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(3,5,'+');
		Assertions.assertEquals(8, result);
	}

	@Test
	public void addPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(3,5,'+');
		Assertions.assertEquals(8, result);
	}
}


