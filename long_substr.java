import java.io.*;
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++) {
            String word="";
            for(int j=i;j<s.length();j++) {
                char ch=s.charAt(j);
                if(word.contains(String.valueOf(ch))) {
                    break;
                }
                word+=ch;
                max=Math.max(max,word.length());
            }
        }

        return max;
    }
}
