package Day1;

public class Pattern_Print {

    public static void main(String[] args) {
        patternPrinter(10);
        StudentDetails();
        area_of_Rectangle();
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        widening_Casting();
        narrow_casting();
        realExample();
        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z);// z will be 1020 (a String)
        mathClass();

    }
    public static void patternPrinter(int x)
    {
        for(int i = 0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void StudentDetails(){

        String studentName = "Abhimanyu Gupta";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'A';
        System.out.println("Student name: "+studentName);
        System.out.println("Student id: "+studentID);
        System.out.println("Student age: "+studentAge);
        System.out.println("Student fee: "+studentFee);
        System.out.println("Student grade: "+studentGrade);
    }

    public  static void area_of_Rectangle()
    {
        int length =4;
        int width = 6;
        int area;
        area = length*width;
        System.out.println("Length is: "+length);
        System.out.println("Width is : "+width);
        System.out.println("Area of the rectangle is : "+area);
    }
    public static void variable_with_different_datatype(){
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items*costPerItem;
        char currency ='$';

        System.out.println("Number of items: "+items);
        System.out.println("Cost per item: "+costPerItem+currency);
        System.out.println("Total cost: "+ totalCost+currency);
    }
    public static void widening_Casting(){
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
    public static void narrow_casting(){
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
    public static void realExample(){
        int maxScore = 500;
        int studentScore = 423;
        float percentage = (float) studentScore/maxScore*100.0f;
        System.out.println("User's percentage is "+ percentage);
    }
    public static void mathClass()
    {
        System.out.println(Math.max(12,23));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(10/3));
    }
}
