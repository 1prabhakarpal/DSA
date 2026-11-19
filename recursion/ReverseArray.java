package recursion;

public class ReverseArray {

    //Two Pointer -Swap L and R then L+1, R-1 until L==R
    public static void reverseTwoPointers(int []arr, int l,int r){
        if(l>=r) return;
        int temp= arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseTwoPointers(arr, l+1, r-1);
    }

    //Two Pointers without L and R
    public static void reverseArr(int[] arr, int i){
        int n= arr.length;
        if(i>=n/2) return;

        int temp = arr[i];
        arr[i]= arr[n-i-1];
        arr[n-i-1] = temp;

        reverseArr(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseTwoPointers(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.print(i+ " ");
        } 
        System.out.println();
        reverseArr(arr, 0);

        for(int i : arr){
            System.out.print(i+ " ");
        } 
    }

}
