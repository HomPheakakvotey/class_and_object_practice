import java.util.Scanner;

public class Student {
    int id;
    String name;
    String gender;
    String className;

    void stuInput(Scanner input){
        System.out.println("Enter id : ");
        id = input.nextInt();
        System.out.println("Enter name : ");
        input.nextLine();
        name = input.nextLine();
        System.out.println("Enter gender : ");
        gender = input.nextLine();
        System.out.println("Enter className : ");
        className = input.nextLine();
    }

    void stuOutput(){
        System.out.println("Id is : "+id);
        System.out.println("Name is : "+name);
        System.out.println("Gender is : "+gender);
        System.out.println("Classname is : "+className);
    }
}
