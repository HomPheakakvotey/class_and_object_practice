package packageA;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {

    private final static int femaletaxrate=30;
    private final static int maletaxrate=50;
    int id;
    String name;
    String gender;
    String position;
    float hours;
    float rate;
    private float findSalary(){
        return hours*rate;
    }
     public String validate(String message,Scanner scanner,String regex)
     {
         while (true)
         {  System.out.println(message);
             String userInput=scanner.nextLine();
             Pattern pattern=Pattern.compile(regex);
             if(pattern.matcher(userInput).matches())
             {
                 return userInput;
             }else{
                 System.out.println("Input wrong format");
             }
         }
     }

     private float findTaxDeduction(){
         float rate = 0;
         if (gender.equalsIgnoreCase("female")) {
             rate = femaletaxrate;
         } else {
             rate = maletaxrate;
         }
         float deduction = findSalary() * (rate / 100);
         System.out.println("Tax : "+rate+"%");
         System.out.println("Tax Salary Deduction "+deduction+"$");
         return deduction;
     }

    public void inputworker(Scanner input) {
        String id1=validate("Enter id : ",input,"[0-9]+");
        id=Integer.parseInt(id1);
        System.out.println("Enter name : ");
        name = input.nextLine();
        gender=validate("Enter gender =",input,"(?:m|M|male|Male|f|F|female|Female|FEMALE|MALE)$");
        System.out.println("Enter position : ");
        position = input.nextLine();
        String hour1=validate("Enter working hours : ",input,"[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)");
        hours = Float.parseFloat(hour1);
        String rate1 = validate("Enter worker rate : ",input,"[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)");
        rate = Float.parseFloat(rate1);
    }
    public void outputWorker(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("gender : "+gender);
        System.out.println("position : "+position);
//      only show if worker salary is legible for the tax
        float deduction = 0;
        if (findSalary() >= 1000) {
            deduction = findTaxDeduction();
        }
        System.out.println("final salary : "+(findSalary()-deduction)+"$");
    }
}
