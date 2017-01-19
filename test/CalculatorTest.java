import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


  private Calculator calculator;

  @Before
  public void setup() {
    calculator = new Calculator();
  }

  @Test
  public void shouldAddTwoNonZeroPositiveNumbers() {
    assertEquals(6, calculator.add(2, 4));
  }

  @Test
  public void shouldAddPositiveAndNegativeNumbers() {
    assertEquals(0, calculator.add(1, -1));

  }

  @Test
  public void shouldAddTwoNegativeNumbers() {
    assertEquals(-2, calculator.add(-1, -1));

  }

  @Test
  public void shouldMultiplyAPositiveNumberWithZeroToReturnZero() {
    assertEquals(0, calculator.multiply(0, 1));

  }

  @Test
  public void shouldMultiplyAPositiveNumberWithOneToReturnTheNumberItself() {
    assertEquals(5, calculator.multiply(1, 5));

  }

  @Test
  public void shouldMultiplyTwoNegativeNumbersToProduceAPositiveNumber() {
    assertEquals(6, calculator.multiply(-2, -3));
  }
}
