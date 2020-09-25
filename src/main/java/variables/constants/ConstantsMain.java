package variables.constants;

public class ConstantsMain {
    static int staticConstant;
    static final String name = "Tapu";//class constants
    final int age = 20;//object or instanc
    static {
        staticConstant = 9;
      //  name="mama"; it is a constant we can't chang it again
    }
    public static void main(String[] args) {
        System.out.println(staticConstant);
        System.out.println(name);
        ConstantsMain c = new ConstantsMain();
        c.sum(20,30);

    }
    public void sum(int x , int y){
        int result = x+y;
        System.out.println(result);
    }
}
