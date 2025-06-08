package Function;

import java.util.Scanner;

public class Functions {

    public static void printMyname(String name){
        System.out.println(name);
        return;

    }
    public static int calculateSum(int a, int b){
        return a+b;
    }

    public static int calculateMultiply(int a,int b){
        return a*b;
    }
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Negative number.");
        }
        int factorial =1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyname(name);// call function

        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = calculateSum(a,b);
        System.out.println("Sum of two number is "+sum);
        int multi = calculateMultiply(a,b);
        System.out.println("Multiple of two number is "+ multi);
        printFactorial(sum);
    }
}
