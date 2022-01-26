package Lab04;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter 3 Values: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a<b && b<c){
            System.out.println(c+" is Greater Number");
        }else
        if (a<b && c<b){
            System.out.println(b+" is Greater Number");
        }else
        if (a>b && a>c){
            System.out.println(a+" is Greater Number");
        }else
            System.out.println("Numbers are Equal");
    }
}
