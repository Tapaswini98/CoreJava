package identifiers;

public class
Identifiers //classname is also an identifier
{
    // max, min panel : ctrl shift f12
    // code formatting: ctrl alt l
    public static void
    main(String[] args)  // methodName is an identifier. args: method parameter is an identifier
    {
        int age = 20; // variableName: age is an identifier
        int AGE = 30;
        int Age = 40;
        System.out.println(age);
        System.out.println(AGE);
        System.out.println(Age);

        // bad practice
        String x = "Tapu";
        String y = "Mamu";
        System.out.println(x+y);

        // identifiers are readable.
        String firstName = "Tapu"; // firstName is an identifier
        String lastName = "Singh"; // lastName is an identifier
        System.out.println(firstName + lastName);
        // String break = "hello"; // break is a java keyword, cant be an identifier

        int a15 = 100;
        System.out.println(a15);

        // int 23y = 56; // starting with numeral not allowed. compilation error.

    }

    public Identifiers() // constructorName: IdentifierMain is also an identifier
    {

    }
}
