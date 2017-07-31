package String;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by yifei on 17/7/31.
 */
public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        char [] str = s.toCharArray();
        HashMap<Character, Integer> word = new HashMap<>();
        int d = 0;
        if (str.length == 1) return 1;
        for(int i = 0, j = 0; i < str.length; i++){
            if( word.containsKey(str[i]) ){
                j = j > word.get(str[i]) + 1 ? j : word.get(str[i]) + 1;
            }
            word.put(str[i], i);
            d = i - j + 1 > d ? i - j + 1: d;
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));

    }

}
