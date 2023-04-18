package niganma;

import java.util.ArrayList;
import java.util.List;

public class NiganmaFour {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-1, -2, -3}));
    }
    public static int maxSubArray(int[] nums) {
        int x=0;
        int r=nums[0];
        for (int num:nums){
            x=Math.max(num+x,num);
            r=Math.max(r,x);
        }
        return r;
    }
}
