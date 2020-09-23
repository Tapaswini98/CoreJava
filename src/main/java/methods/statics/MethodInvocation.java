package methods.statics;

public class MethodInvocation {
    {
        System.out.println("Non static block");
        m1();
        System.out.println("Non static block end");

    }
    static{
        System.out.println("static block");
        m2();
        System.out.println("static block end");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        MethodInvocation m = new MethodInvocation(); //static block invocation
        m.m1();//non static method invocation

    }
    void m1(){
        System.out.println("non-static method m1");
    }
    static  void m2(){
        System.out.println("static method m2");
    }

}
