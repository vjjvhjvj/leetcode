package ikun;

import java.util.ArrayList;
import java.util.List;

public class IkunSeven {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
    }
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        int rightmost=0;
        for (int i=0;i<n;i++){
            if(i<=rightmost){
                rightmost=Math.max(rightmost,i+nums[i]);
                if (rightmost>=n-1){
                    return true;
                }
            }
        }
        return false;
    }
}
