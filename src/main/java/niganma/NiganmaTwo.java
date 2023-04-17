package niganma;

import java.util.HashSet;
import java.util.Set;

public class NiganmaTwo {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
    public static int countSubstrings(String s) {
        int n=s.length();
        if(n==1) return 1;
        int ans=0;
        for (int i=0;i<2*n-1;i++){
            int left=i/2;
            int right=left+i%2;
            while (left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }
}
