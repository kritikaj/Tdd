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
  public void shouldDivideAPositiveNumberByOneToReturnTheSameNumber() throws Exception {
    assertEquals(5, calculator.divide(5, 1));
  }

  @Test(expected = InvalidDivisorException.class)
  public void shouldNotAllowDivisionOfANumberByZero() throws Exception {
    calculator.divide(7, 0);
  }

  @Test(expected = InvalidDivisorException.class)
  public void shouldNotAllowDivisionOfANumberWithADivisorGreaterThanTheNumber() throws Exception {
    calculator.divide(3, 5);
  }

  @Test
  public void shouldReturnNearestRoundOffValueIfTheQuotientIsAFraction() throws Exception {
    assertEquals(1, calculator.divide(5, 3));
  }

  @Test
  public void shouldDivideANegativeDividendWithAPositiveDivisorToGiveANegativeQuotient() throws Exception {
    assertEquals(-2, calculator.divide(-6, 3));
  }

  @Test
  public void shouldDivideTwoNegativeNumbersToReturnAPositiveQuotient() throws Exception {
    assertEquals(2, calculator.divide(-6, -3));
  }

  @Test
  public void shouldDivideAPositiveDividendByANegativeDivisorToGiveANegativeQuotient() throws Exception {
    assertEquals(-2, calculator.divide(10, -5));
  }

  @Test(expected = InvalidDivisorException.class)
  public void shouldNotAllowDivisionOfANegativeDividendWithAPositiveDivisorIfTheQuotientWillBeLessThanMinusOne() throws Exception {
    calculator.divide(-3, 5);
  }

  @Test
  public void shouldAllowDivisionOfANegativeDividendWithAPositiveDivisorToReturnNearestWholeNumberIfResultIsGreaterThanOne() throws Exception {
    assertEquals(-2, calculator.divide(-5, 3));
  }

  @Test(expected = InvalidDivisorException.class)
  public void shouldReturnZeroIfZeroIsDividedByAPositiveNumber() throws Exception {
    calculator.divide(0, 8);
  }

  @Test(expected = InvalidDivisorException.class)
  public void shouldReturnZeroIfZeroIsDividedByNegativeNumber() throws Exception {
    calculator.divide(0, -4);
  }
}
