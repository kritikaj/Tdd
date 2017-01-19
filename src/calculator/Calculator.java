package calculator;

public class Calculator {
  public int add(int operand1, int operand2) {
    return operand1 + operand2;
  }

  public int multiply(int operand1, int operand2) {
    return operand1 * operand2;
  }

  public int divide(int dividend, int divisor) throws UndefinedOperation {
    if((divisor == 0) || (divisor>dividend)){
      throw new UndefinedOperation();
    }
    return dividend/divisor;
  }
}
