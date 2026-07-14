// import java.util.Scanner;
public class Prac1{
    public static void main(String[] args){
        System.out.println("Bye world");

        //Data types
        int age=20;
        double salary=100000.25;
        char grade='A';
        boolean isStudent=true;
        String name="Soham";

        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        System.out.println("Student: "+isStudent);


        
        //implicit Casting
        int a=45;
        float b=a;
        System.out.println("implicit casting "+b);


        //Explicit Casting
        float marks=92.55f;
        int Tmarks=(int)marks;
        System.out.println("Explicit casting "+Tmarks);

        //Addition of Two Numbers:
        int number1=10;
        int number2=20;
        int add=number1+number2;
        System.out.println("Addition of " +number1+ " And "+number2+ " is: "+add);

    

    }

}
