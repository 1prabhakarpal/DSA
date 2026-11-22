package sorting;

import java.util.Arrays;


//Push the maximum to the last by adjacent swap
public class BubbleSort {
    public static void swap(int arr[], int l, int r){
        int t = arr[l]; arr[l]=arr[r];arr[r]=t;
    }

    public int[] bubbleSort(int[] nums) {
        for(int i= nums.length-1;i>=1;i--){
            boolean swapped = false;
            for(int j = 0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return nums;
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();

        int[] test1 = {5, 1, 4, 2, 8};
        System.out.println(Arrays.toString(sorter.bubbleSort(test1)));

        int[] test2 = {3, -1, 3, 0, -1};
        System.out.println(Arrays.toString(sorter.bubbleSort(test2)));
    }
}