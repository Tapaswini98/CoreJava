package constructors;

public class Calculator {
    int i ;
    int j ;

    public Calculator(){
        System.out.println("Before Initialization : i"+i);
        System.out.println("Default Constructor");
        i = 10;
        System.out.println("After Initialization : i"+i);
    }
    public Calculator(int x, int y){
        System.out.println("Before Initialization :i "+i +"\t j "+j);
        System.out.println("2 parameter constructor");
        i = x;
        j = y;
        System.out.println("After Initialization :i "+i +"\t j "+j);
    }
    public Calculator(int m){
        System.out.println("Before Initialization :i "+i +"\tj "+j);
        i = m;
        System.out.println("1 parameter constructor");
        System.out.println("After Initialization :i "+i +"\tj "+j);
    }
}
