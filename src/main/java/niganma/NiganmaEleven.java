package niganma;

import java.util.HashMap;
import java.util.Map;

public class NiganmaEleven {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 3}, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        int sum=0;//记录数量
        int count=0;//记录最终的值
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int num:nums){
            sum+=num;
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
