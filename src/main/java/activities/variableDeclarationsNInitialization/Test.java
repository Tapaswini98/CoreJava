package activities.variableDeclarationsNInitialization;

public class Test {
    public static int x;
    public String y;
    static {
        x = 20 ;
        System.out.println(x);//20
    }
    {
        y = "Hello";
        System.out.println(y);
    }

    public static void main(String[] args) {
     Test var = new Test();
     m1();
     var.m2();
    }
  public  static  void m1(){
        x= 30;
      System.out.println(x);
  }
  public void m2(){
        y = "Bye";
      System.out.println(y);
  }
}

