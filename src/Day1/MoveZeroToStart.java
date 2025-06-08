package Day1;

import java.util.Arrays;

public class MoveZeroToStart {
    public static void main(String[] args) {
        int[] arr={0,0,12,1,2,0,23,0};
        moveZerosToStart(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void moveZerosToStart(int [] arr){
        int n= arr.length;
        int[] result = new int[n];

        int index = n-1;
        // add non-zero elements to the end of the result array
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=0){
                result[index--]=arr[i];
            }
            System.out.println(Arrays.toString(result));
        }
        System.out.println(Arrays.toString(result));
        //copy the result back to the original array
        System.arraycopy(result,0,arr,0,n);
    }
}
