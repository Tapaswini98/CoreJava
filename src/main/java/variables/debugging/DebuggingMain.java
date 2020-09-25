package variables.debugging;

public class DebuggingMain {
    static int staticValue = 10;
    int nonstaticValue= 200;

    public static void main(String[] args) {
        DebuggingMain d = new DebuggingMain();
        d.sum(5,6);
    }
  public  DebuggingMain(){
      System.out.println("inside constructor");
  }
    public void sum(int x , int y){
        int result = x + y;
        System.out.println("sum method");
    }
}
