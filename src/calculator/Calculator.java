package calculator;

import java.util.List;

import static java.lang.StrictMath.*;

public class Calculator {
  public int add(int operand1, int operand2) {
    return operand1 + operand2;
  }

  public int multiply(int operand1, int operand2) {
    return operand1 * operand2;
  }

  //Wrong use case for throwing exception
  public int divide(int dividend, int divisor) throws InvalidDivisorException {

    boolean isDivisorZero = divisor == 0;
    boolean isDivisorGreaterThanDividend = abs(divisor) > abs(dividend);

    if (isDivisorZero ) {
      throw new InvalidDivisorException("Divisor is Zero");
    }
    if(isDivisorGreaterThanDividend){
      throw new InvalidDivisorException("Divisor is greater than dividend");
    }
    return (int) floor((float) dividend / divisor);
  }

}
