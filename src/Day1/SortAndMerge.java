package Day1;

import java.util.Arrays;

public class SortAndMerge {

    public static int[] SortMerge(int[] a,int[] b){
        int[] merged = new int[a.length+b.length];
        System.out.println(merged.length);
        for(int i=0;i<a.length;i++){
            merged[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            merged[a.length+i]=b[i];
        }


        return merged;

    }
    public static int[] sorted(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    // Swap elements
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {

        int a[]={10,3,2,5,15};
        int b[]={20,2,12};

        int [] mergearr=SortMerge(a,b);
        int [] res = sorted(mergearr);

        System.out.print("Sorted and merged list : ");
        for(int i=0;i<res.length;i++){
            System.out.print(" "+ res[i]);
        }

    }
}
