package blocks;

public class StaticBlock {
    //class will load and execute the static blocks first
    static {
        System.out.println("Static block-1");
        System.out.println("Static block-2");
    }
    static {
        System.out.println("Static block-3");
        System.out.println("Static block-4");
    }
    public static void main(String[] args) {
        System.out.println("Main method executing");
    }
}
