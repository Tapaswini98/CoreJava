package activities.staticMethods;

public class Test {
    static {
        m1();
    }
    public static void main(String[] args) {
        m1();
        m2();
    }

    public  static  void m1(){
        System.out.println("Inside static method m1");
    }
    public static  void m2(){
        System.out.println("Inside static method m2");
        m1();
    }
}
