package variables.blocks;

public class VariableBlocks {
    //variables declared in a block are local only
    static {
        int x = 10;
        System.out.println("Declared inside static block"+x);
    }
    {
        int y = 20;
        System.out.println(y);
    }

    public static void main(String[] args) {
        VariableBlocks v = new VariableBlocks();
        v.sum();
        v.sum(8,9);

    }
    public void sum(int x , int y){
        int result = x + y;
        System.out.println(result);
    }
    public void sum(){
        int result = 10+20;
        System.out.println(result);
    }
}
