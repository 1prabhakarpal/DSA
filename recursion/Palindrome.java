package recursion;

public class Palindrome {
    
    public static boolean isPalindrome(String s, int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;

        return isPalindrome(s, l+1, r-1);
    }

    public static boolean isPalindrome1(String s, int i){
        int n = s.length();
        if(i>=n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;

        return isPalindrome1(s, i+1);
    }

    // Time Complexity : O(N)
    // Space Complexity : O(N)

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(isPalindrome(s, 0, s.length()-1));
        System.err.println(isPalindrome1(s, 0));
    }
}
