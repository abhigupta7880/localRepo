package Day1;

public class Sorting {

    public static void main(String[] args) {

        int[] numbs ={6,5,2,8,9,4};
        int size = numbs.length;
        int temp=0;
        System.out.println("Before sorting");
        for(int num: numbs){
            System.out.print(num+ " ");
        }
        // swapping
        for(int i =0;i<size;i++) {

            for(int j=0;j<size-i-1;j++){

                if(numbs[j]>numbs[j+1]){
                    temp = numbs[j];
                    numbs[j]=numbs[j+1];
                    numbs[j+1]=temp;
                }

            }
            System.out.println();
            for(int num: numbs){
                System.out.print(num+" ");
            }
        }




        System.out.println();
        System.out.println("After sorting");
        for(int num: numbs){
            System.out.print(num+" ");
        }
    }
}
