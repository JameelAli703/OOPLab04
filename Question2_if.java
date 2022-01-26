package Lab04;

import java.util.Scanner;

public class Question2_if {
    public static void main(String[] args) {
        int a, b, c, choice;
        System.out.println("Calculator Menu");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Subtraction");
        System.out.println("4. Division");
        System.out.print("Enter Your Choice : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        if (choice==1) {
            System.out.println("Addition");
            System.out.print("Enter a = ");
            a = sc.nextInt();
            System.out.print("Enter b = ");
            b = sc.nextInt();
            c =a +b;
            System.out.println("a + b = "+c);
        }if (choice==2) {
            System.out.println("Multiplication");
            System.out.print("Enter a = ");
            a = sc.nextInt();
            System.out.print("Enter b = ");
            b = sc.nextInt();
            c =a *b;
            System.out.println("a x b = "+c);
        }if (choice==3) {
            System.out.println("Subtraction");
            System.out.print("Enter a = ");
            a = sc.nextInt();
            System.out.print("Enter b = ");
            b = sc.nextInt();
            c =a -b;
            System.out.println("a - b = "+c);
        }if (choice==4) {
            System.out.println("Division");
            System.out.print("Enter a = ");
            a = sc.nextInt();
            System.out.print("Enter b = ");
            b = sc.nextInt();
            c =a /b;
            System.out.println("a / b = "+c);
        }
    }
}
