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
    if(divisor>=0 ){
      if(dividend > 0){
        if((divisor == 0) || (divisor>dividend)){
          throw new UndefinedOperation();
        }
      }
      else if((dividend < 0) && (abs(dividend)<divisor)){
        throw new UndefinedOperation();
      }

    }
    float result = (float) dividend/divisor;
    return (int) floor(result);
  }
}
