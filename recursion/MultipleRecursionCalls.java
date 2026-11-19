package recursion;

public class MultipleRecursionCalls {

    //0 1 1 2 3 5 8 13 21 . . . . . .{TC -> O(2^n) exponential, SC -> O(N)}
    public static long nThFibonacci(int n){
        if(n<=1) return n;
        return nThFibonacci(n-1)+nThFibonacci(n-2);
    }

    public static void main(String[] args) {
       System.out.println(nThFibonacci(7));
    }
}
