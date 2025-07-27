package Arrays;

import java.util.Arrays;

public class twoSumArray {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }

        return arr;
    }
}
