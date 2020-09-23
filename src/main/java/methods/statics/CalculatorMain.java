package methods.statics;



public class CalculatorMain {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        int sumResult = cal.sum(10, 20); // non static method invocation by object of the class
        System.out.println(sumResult);

        int mulResult = Calculation.mul(10,20); // static method invocation by classname
        System.out.println(mulResult);
        cal = null;
        int mulResultt = cal.mul(10,40);
        System.out.println(mulResultt);

    }
}
