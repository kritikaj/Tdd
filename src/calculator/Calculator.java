package calculator;

import static java.lang.StrictMath.*;

public class Calculator {
  public int add(int operand1, int operand2) {
    return operand1 + operand2;
  }

  public int multiply(int operand1, int operand2) {
    return operand1 * operand2;
  }

  public int divide(int dividend, int divisor) throws UndefinedOperation {
    if((divisor == 0) || (abs(divisor)>abs(dividend))){
      throw new UndefinedOperation();
    }
    return (int) floor( (float) dividend/divisor);
  }
}
