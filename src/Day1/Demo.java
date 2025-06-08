package Day1;

public class Demo {

    public static void main(String[] args) {
        int[] nums = {5,6,11,23,34};
        int target =13;

        int result1 = binarySearch(nums,target);
        int result2 = linearSearch(nums,target);
        if(result1 !=-1){
        System.out.println("Element found at index : "+ result1);
        }
        else System.out.println("Element not found ");
    }

    // Linear search
    public static int linearSearch(int[] nums, int target) {
        int step = 0;
        for(int i = 0; i<nums.length;i++)
        {
            step++;
            if(nums[i]==target){
                System.out.println("Steps taken by Linear search "+ step);
                return i;
            }
        }
        System.out.println("Steps taken by Linear search "+step);
        return -1;
    }


    // Binary search
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int steps = 0;
        while (left<=right){
            steps++;
            int mid = (left+right)/2;
            if(nums[mid]==target){
                System.out.println("Steps taken by binary search "+steps);
                return mid;
            } else if (nums[mid]<target) {
                left = mid+1;

            }else{
                right=mid-1;
            }

        }
        System.out.println("Steps taken by Binary search "+steps);
        return -1;

    }
}
