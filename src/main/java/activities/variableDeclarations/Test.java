package activities.variableDeclarations;

public class Test {
    public  static int  x;
    public  String y;
   static
    {
        System.out.println(x);
        //System.out.println(y);//Compilation error:  calling a non-static variable from static block
        System.out.println("=======================");
    }
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Test var = new Test();
        var.m2();
        m1();
    }
    public static  void m1(){
        System.out.println(x);
        //System.out.println(y);//Compilation error :calling non-static variable  from a static method
        System.out.println("=======================");
    }
    public void m2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println("=======================");
    }
}
//Default output is 0 and null
