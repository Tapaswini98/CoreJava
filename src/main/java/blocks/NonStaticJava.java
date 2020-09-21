package blocks;

class NonStaticBlock {
    {
        System.out.println("Non-static block-1");
        System.out.println("Non-static block-2");
    }
    {
        System.out.println("Non-static block-3");
        System.out.println("Non-static block-4");
    }
    public static void main(String[] args) {
        System.out.println("Main method output");
        new NonStaticBlock();//It creates a object.
        System.out.println("------------------------------");
        new NonStaticBlock();
        System.out.println("**********************************");
        new NonStaticBlock();
    }
}
