package Function;

import java.util.Scanner;

public class Practice {

    public static int printAverage(int a,int b, int c){
        return (a+b+c)/3;
    }
    public static int sumofOddnum(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }

        }
        return sum;
    }
    public static int maxofTwoNumber(int a, int b){
        if(a>b){
            return a;
        }return b;
    }
    public static void eligibleAge(int age){
        if(age<18){
            System.out.println("You younger,Grow up man");
        } else{
            System.out.println("You are eligible to vote");
        }
    }
    public static double printCircumference(int radius){
        return 2*(Math.PI)*radius;
    }
    public static void infiniteLoop(boolean isVisible){
        do{
            System.out.println("hello");
        }while(isVisible);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3 = sc.nextInt();
        int avgof3number = printAverage(number1,number2,number3);
        System.out.println("Average of 3 number is "+avgof3number);
        System.out.println("Sum of odd number is "+sumofOddnum(number1));
        System.out.println("Max of two number is "+maxofTwoNumber(number1,number2));
        eligibleAge(number1);
        System.out.println("Circumference of Circle is "+printCircumference(number3));
        infiniteLoop(true);
    }
}
