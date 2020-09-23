package methods.statics;

public class Calculation {
    public int sum(int x, int y){//non static method
        int result = x+y;
        return  result;
    }
    public  static int mul(int a, int b){ // static method
        int result = a*b;
        return result;
    }
}
