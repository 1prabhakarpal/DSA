package hashing;

import java.util.Scanner;

public class NumberHashng {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        //precompute hash ----> hash[n]. for me i keep 13 as n max

        int[] hash = new int[13];
        for(int i = 0; i<arr.length;i++)
            hash[arr[i]]+=1;;


        int q = sc.nextInt();
        while(q-->0){
            int num = sc.nextInt();
            System.out.println(num+ " --> " + hash[num]);
        }

        sc.close();
    }


/**
 * Java: arrays are always on the heap (local or static doesn't matter).
 * Limit = heap size (-Xmx) / judge memory limit. Failure = OutOfMemoryError.
 * int ~4 bytes, boolean ~1 byte per element.
 * int[10^7] (~40MB) is safe; int[10^8] (~400MB) usually isn't.
 */
}
