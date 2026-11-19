package recursion;

public class Factorial {

    //paramaterized way
    public static void factorialOfNPar(int n,int fact){
        if(n==1) {
            System.out.println(fact);
            return;
        }        
        factorialOfNPar(n-1, fact*n);
    }
    
    //functional way
    public static int factorialOfNFun(int n){
        if(n==1) return 1;
        return n*factorialOfNFun(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorialOfNFun(5));
        factorialOfNPar(5, 1);
    }
}
