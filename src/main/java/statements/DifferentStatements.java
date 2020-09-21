package statements;

public class DifferentStatements {
    public static void main(String[] args) {
        //some statements are declaration statement
        //control statement
        String name ="Tapaswini Kar";
        int marks = 80; // marks is variableName whos type is int

        System.out.println(name);
        System.out.println(marks);

        // expression statements: calculation
        int a = 30;
        int b = 20;
        // = is an assignemnt operator
        int sum = a - b; // calculation with addition operator +
        System.out.println(sum);

        // control statements
        int age = 20;
        if( age >= 18)
        {
            System.out.println("you are eligible to vote in the election");
        }
        else{
            System.out.println("you are not elligible to vote in the election!!!");
        }
    }
}
