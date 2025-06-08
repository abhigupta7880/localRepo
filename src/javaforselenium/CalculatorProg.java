package javaforselenium;

public class CalculatorProg {

    int n1=20;
    int n2 =30;
    void add(){
        int res = n1+n2;
        System.out.println("Addition of two number is " + res);
    }
    void trycatch(){
        for(int i = 0;i<5;i++){
            try{
                System.out.println("Index : "+i);
                if(i==2){
                    throw new RuntimeException("Some thing went wrong");
                }
            }catch(Exception e){
                System.out.println("Caught exception "+e.getMessage());
            };
        }
        System.out.println("After loop");
    }

    public static void main(String[] args) {

        CalculatorProg calculatorprog = new CalculatorProg();
        calculatorprog.add();
        calculatorprog.trycatch();

        for (int i=0;i<5;i++)
        {
            System.out.println("Index : "+i);
            if(i==2){
                throw new RuntimeException("Something went wrong !");
            }
        }
        System.out.println("After loop");
    }

}
