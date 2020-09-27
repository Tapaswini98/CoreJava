package activities.blocks;

public class Test {
    static {
        System.out.println("Static block-1 statement-1");
        System.out.println("Static block-1 statement-2");
    }
    static {
        System.out.println("Static block-2 statement-1");
        System.out.println("Static block-2 statement-1");
    }
    {
        System.out.println("Non-Static block-1 statement-1");
        System.out.println("Non-Static block-1 statement-2");
    }
    {
        System.out.println("Non-static block-2 statement-1");
        System.out.println("Non-Static block-2 statement-2");
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Inside main method");
    }
}
