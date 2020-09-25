package variables.classes;

public class VariableClass {
    public static  int ageOfStudent;//static variable
    public String nameOfStudent;//non-static variable
    public static int rankOfStudent = 5;
    public String nativePlace="Jajpur";

    public static int x;
    public String y;
    {
        System.out.println("Non-static variable with default reference value"+nameOfStudent);
        System.out.println("Non-static variable with initialized value"+nativePlace);
        y = "Tapaswini";
        System.out.println("non-static value init inside non-static block"+y);
    }
    public static void main(String[] args) {
        System.out.println("Static variable with default reference value"+ageOfStudent);
        System.out.println("Static variable with initialized value"+ rankOfStudent);
        VariableClass v = new VariableClass();
        v.m2();
    }
    static  void  m1(){
        x = 500;
        System.out.println("Init Inside static method "+x);
    }
    void m2(){
        y= "Mama";
        System.out.println("Init inside non-static method"+y);
    }
    public VariableClass(){
        x = 200;
        System.out.println("Inside constructor"+x);
        y = "Sachin";
        System.out.println("Inside constructor"+y);
    }
}
