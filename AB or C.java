import java.util.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
class Codechef
{
    static class Pair {
        int val, idx;
        Pair(int v, int i){
            val = v;
            idx = i;
        }
    }

	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0){
	        int n = sc.nextInt();
	        
	        List<Pair> list = new ArrayList<>();
	        
	        for(int i = 0; i < n; i++){
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int c = sc.nextInt();
	            
	            list.add(new Pair(a, i));
	            list.add(new Pair(b, i));
	            list.add(new Pair(c, i));
	        }
	        
	        // Sort by value
	        Collections.sort(list, (x, y) -> x.val - y.val);
	        
	        int[] count = new int[n];
	        int unique = 0;
	        int left = 0;
	        int ans = Integer.MAX_VALUE;
	        
	        for(int right = 0; right < list.size(); right++){
	            Pair r = list.get(right);
	            
	            if(count[r.idx] == 0) unique++;
	            count[r.idx]++;
	            
	            // When all indices covered
	            while(unique == n){
	                int range = list.get(right).val - list.get(left).val;
	                ans = Math.min(ans, range);
	                
	                Pair l = list.get(left);
	                count[l.idx]--;
	                if(count[l.idx] == 0) unique--;
	                
	                left++;
	            }
	        }
	        
	        System.out.println(ans);
	    }
	}
}
