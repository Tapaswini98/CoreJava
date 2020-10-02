package constructors;

import java.util.concurrent.Callable;

public class CalculatorConstructorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.i);
        System.out.println(calculator.j);

        Calculator calculator1 = new Calculator();
        calculator1.i = 100;
        System.out.println(calculator.i);
        System.out.println(calculator1.i);
    }


}
