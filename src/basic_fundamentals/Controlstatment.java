package basic_fundamentals;


import java.util.Scanner;

//Task1 condtionstatemnt
   // class condtion{
//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the number");
//            int num=sc.nextInt();
//            if(num%2==0) {
//                System.out.println("Even number");
//            }else{
//                System.out.println("Odd Number");
//                }
//            //taks2 Grade
//            System.out.println("Enter the marks");
//            int marks=sc.nextInt();
//            if(marks>90){
//                System.out.println("Grade is A");
//
//            }else if(marks>70){
//                System.out.println("Grade B");
//            }else if(marks>50){
//                System.out.println("Grade C");
//            }else{
//                System.out.println("Fail");
//            }
//            //Menu Switch
//            System.out.println("Enter the numnber1");
//            int number1=sc.nextInt();
//            System.out.println("Enter the numnber2");
//            int number2=sc.nextInt();
//            System.out.println("Enter the operators");
//            int operator=sc.nextInt();
//            switch (operator){
//                case 1:
//                    System.out.println("Addition"+(number1+number2));
//                    break;
//                case 2:
//                    System.out.println("Subraction"+(number1-number2));
//                    break;
//                case 3:
//                    System.out.println("Mulitiplication"+(number1*number2));
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//            }
//sc.close();
//        }
        //loops program
//        class Loops{
//            public static void main(String[] args) {
       //for loop
                //Taks 1
//                     for(int i=0;i<=10;i++){
//                  System.out.println(i);
//              }
                     //while loop
//                int i=1;
//                while(i<=10){
//                    System.out.println(i);
//                    i++;
//                }
//                //do-while
//                int i=1;
//                do{
//                    System.out.println(i);
//                    i++;
//                }while(i<=10);
//
//            //tasks -2 Even
//    for(int n=1;n<=50;n++){
//        if(n%2==0){
//            System.out.println("Even number is"+n);
//        }
//    }
//
//
//        //Reverse Taks 3
//    for(int r=10;r>=1;r--){
//        System.out.println(r);
//    }
//    // sum ofnumber by user
//                System.out.println("Enter the Adding of number");
//                Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int sum=0;
//
//    for(int is=1;is<=n;is++){
//        sum+=is;
//    }
//                System.out.println(sum);
//            }

//}
class Patterns{
    public static void main(String[] args) {
        //Square
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Right Triangle
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Number right trignale
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Rever right triangle
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //center triangle
        for (int i=1;i<=4;i++){
            for(int g=4;g>=i;g--){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}



