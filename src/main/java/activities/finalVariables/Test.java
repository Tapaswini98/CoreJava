package activities.finalVariables;

public class Test {
    public final static int x = 2;
   // x= 3; // error :trying to assign a final variable
    public final int y = 7;
    // y= 5; //error:trying to assign a final variabl
    public static void main(String[] args) {
        Test var = new Test();
        System.out.println(x);
        System.out.println(var.y); // cannot print non static final variable so it is called using object var
    }

}
