package basic_fundamentals;
import java.util.Scanner;
public class Inputinf {
    public static void main(String[] args) {
//Task1
       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Name");
//        String name=sc.nextLine();
//        System.out.print("Enter age: ");
//        int age = sc.nextInt();
//        System.out.print("Enter City: ");
//        int city = sc.nextInt();
        //Task2

        System.out.println("Enter the first value");
        int first=sc.nextInt();
        System.out.println("Enter the second value");
        int sec=sc.nextInt();
        System.out.println("Sum is"+(first+sec));
        System.out.println("Subract is"+(first-sec));
        System.out.println("Product is"+(first*sec));
        System.out.println("Division is"+(first/sec));


    }
}
