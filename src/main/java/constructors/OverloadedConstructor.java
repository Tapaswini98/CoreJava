package constructors;

public class OverloadedConstructor {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(50);
        Calculator c3 = new Calculator( 60,80);

        System.out.println(c1.i+"\t"+c1.j);
        System.out.println(c2.i+"\t"+c2.j);
        System.out.println(c3.i+"\t"+c3.j);
    }
}
