import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.id = 001;
//        student1.name = "koko";
//        student1.gender = "male";
//        student1.className = "Java";
//
//        System.out.println("Student1 name is : "+student1.name);
        Scanner input = new Scanner(System.in);
        Student student1 = new Student ();
        student1.stuInput(input);
        student1.stuOutput();

    }
}
