package hashing;

/**
 * ===== NOTE: Character Hashing =====
 *
 * ARRAY (when chars are known)
 *  - lowercase → int[26], index = ch - 'a'
 *  - any ASCII → int[256], index = ch
 *  - back to char: (char) (i + 'a')   // NOT (char) i + 'a' → prints a number
 *
 * HASHMAP (when chars are unknown/mixed, or keys are large/negative)
 *  - freq.merge(ch, 1, Integer::sum);   // count
 *  - freq.getOrDefault(ch, 0);          // query
 *
 * COMPLEXITY
 *  - Array:   precompute O(n), query O(1), space O(26)
 *  - HashMap: precompute O(n), query O(1) avg, space O(distinct)
 *
 * RULE: small non-negative key → array, else → HashMap
 */
public class CharacterHashing {
    public static void main(String[] args) {
        int[] arr = new int[26];
        String s1="sdxcwdwqdqww";

        for(char ch : s1.toCharArray()){
            arr[ch-'a']+=1;
        }

        for(int i = 0;i<arr.length;i++){
            System.out.println((char) (i + 'a') +"-->"+arr[i]);
        }
        
    }
    
}
