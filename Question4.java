package Lab04;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        long factorial =1;
        int i =1;
        int a, b,c;
        System.out.print("Enter The Number one : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.print("Enter the number two : ");
        b = sc.nextInt();
        do {
            factorial = factorial*i;
            i++;
        }while (i<=a);
        System.out.println("factorial of "+a+" is "+factorial);
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"x"+b+"="+(a*b));
        System.out.println(a+"-"+b+"="+(a-b));
    }
}
