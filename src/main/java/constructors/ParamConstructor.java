package constructors;

public class ParamConstructor {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,20);
        System.out.println(calculator.i);
        System.out.println(calculator.j);

        Calculator c1 = new Calculator(40,60);
        System.out.println(c1.i);
        System.out.println(c1.j);

        System.out.println(calculator==c1);
    }
}
