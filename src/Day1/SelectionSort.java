package Day1;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbs = {6,5,2,8,9,4};
        int target = 32;
        int size = numbs.length;
        int temp = 0;

        System.out.println("Before sorting ");
        for(int num: numbs){
            System.out.print(num+" ");
        }

        for(int i=0;i<size;i++){
            int minIndex = i;
            for(int j=i+1;j<size;j++){
                if(numbs[minIndex]>numbs[j]){
                    minIndex = j;
                }}
                temp = numbs[minIndex];
                numbs[minIndex]=numbs[i];
                numbs[i]=temp;
                System.out.println();
                for(int num: numbs){
                    System.out.print(num+ " ");
                }



        }

        System.out.println();
        System.out.println("After sorting ");
        for(int num: numbs){
            System.out.print(num+" ");
        }
    }
}
