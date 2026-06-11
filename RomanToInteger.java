import java.io.*;
import java.util.*;
import java.util.Scanner;
class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            if(value(s.charAt(i))<value(s.charAt(i+1))){
                ans-=value(s.charAt(i));
            }
            else{
                ans+=value(s.charAt(i));
            }
           
        } 
        ans += value(s.charAt(s.length() - 1));
        return ans;

        
    }
    int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000; 
    }
}
