package calculator;

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

  @Test
  public void shouldMultiplyTwoNonZeroPositiveNumbers() throws Exception {
    assertEquals(15, calculator.multiply(3, 5));
  }

  @Test
  public void shouldDivideAPositiveNumberByOneToReturnTheSameNumber() throws Exception, UndefinedOperation {
    assertEquals(5, calculator.divide(5, 1));
  }

  @Test(expected = UndefinedOperation.class)
  public void shouldNotAllowDivisionOfANumberByZero() throws Exception, UndefinedOperation {
    calculator.divide(7, 0);
  }

  @Test(expected = UndefinedOperation.class)
  public void shouldNotAllowDivisionOfANumberWithADivisorGreaterThanTheNumber() throws Exception, UndefinedOperation {
    calculator.divide(3, 5);
  }

  @Test
  public void shouldReturnNearestRoundOffValueIfTheQuotientIsAFraction() throws Exception, UndefinedOperation {
    assertEquals(1, calculator.divide(5, 3));
  }

  @Test
  public void shouldDivideANegativeDividendWithAPositiveDivisorToGiveANegativeQuotient() throws Exception, UndefinedOperation {
    assertEquals(-2, calculator.divide(-6, 3));
  }

  @Test
  public void shouldDivideTwoNegativeNumbersToReturnAPositiveQuotient() throws Exception, UndefinedOperation {
    assertEquals(2, calculator.divide(-6, -3));
  }

  @Test
  public void shouldDivideAPositiveDividendByANegativeDivisorToGiveANegativeQuotient() throws Exception, UndefinedOperation {
    assertEquals(-2, calculator.divide(10, -5));
  }

  @Test(expected = UndefinedOperation.class)
  public void shouldNotAllowDivisionOfANegativeDividendWithAPositiveDivisorIfTheQuotientWillBeLessThanMinusOne() throws Exception, UndefinedOperation {
    calculator.divide(-3, 5);
  }

  @Test
  public void shouldAllowDivisionOfANegativeDividendWithAPositiveDivisorToReturnNearestWholeNumberIfResultIsGreaterThanOne() throws Exception, UndefinedOperation {
    assertEquals(-2, calculator.divide(-5, 3));
  }
}
