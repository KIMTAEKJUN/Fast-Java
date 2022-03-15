package ch14;

import ch14.Calc;
import ch14.CompleteCalc;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        // total은 static 메소드이기 때문에 interface 이름으로 바로 호출해서 사용해도 된다.
        System.out.println(Calc.total(arr));
    }
}
