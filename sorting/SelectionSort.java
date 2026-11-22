package sorting;

import java.util.Arrays;

//Select maximum and swap
public class SelectionSort {

    private static void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(nums, i, min);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();

        int[] test1 = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(sorter.selectionSort(test1)));

        int[] test2 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sorter.selectionSort(test2)));
    }
}