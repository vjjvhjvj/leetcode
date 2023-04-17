package niganma;

import java.util.HashSet;
import java.util.Set;

public class NiganmaOne {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        //将所有的元素存入hash表
        for (int num : nums) {
            set.add(num);
        }
        int res=0;
        //遍历元素
        for (Integer x : set) {
            if(!set.contains(x-1)){
                int y=x;
                while(set.contains(y+1)) y++;
                res=Math.max(res,y-x+1);
            }
        }
        return res;
    }

    //最长序列
}
