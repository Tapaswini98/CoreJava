package basics;

public class AppKeywords {
    public static void main(String[] args) {
        String studentName = "Tapu"; // only one value
        System.out.println(studentName);

        System.out.println("display array");
        //   String[] studentNames = {"Tapu", "Mama", "Mamu"};
        String studentNames[] = {"Tapu", "Mama", "Mamu"};
        System.out.println(studentNames[0]);
        System.out.println(studentNames[1]);
        System.out.println(studentNames[2]);
        System.out.println(studentNames.length);
    }
}
