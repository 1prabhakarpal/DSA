package recursion;

public class SumOfFirstN {
    //Paramatrized Way
    public static void sumFirstNParam(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sumFirstNParam(n-1, sum+n);
    }

    //functional
    public static int sumOfFirstN(int n){
        if(n==1) return 1;
        return n+sumOfFirstN(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfFirstN(3));
        sumFirstNParam(5, 0);
    }
}
