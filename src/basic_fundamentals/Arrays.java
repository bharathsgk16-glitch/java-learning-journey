package basic_fundamentals;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
//        System.out.println("Enter the value");
     Scanner sc=new Scanner(System.in);
//        for (int i=0;i<arr.length;i++){
//
//            arr[i]=sc.nextInt();
//        }
//
        System.out.println("Enter the 5 marks");
        int total=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        double avg=total/arr.length;

        System.out.println("Sum = " + total);
        System.out.println("Average = " +avg);
    }
}
