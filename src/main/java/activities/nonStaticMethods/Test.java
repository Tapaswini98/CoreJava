package activities.nonStaticMethods;

public class Test {
    {
        System.out.println("Non-static block");
        m1();
    }
    public static void main(String[] args) {
      Test var = new Test();
      var.m2();
    }
    public void m1(){
        System.out.println("Inside non-static method m1");
    }
    public void m2(){
        System.out.println("Inside non-static method m2");
        m1();
    }
}
