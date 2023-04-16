package ikun;

import java.util.HashMap;
import java.util.Map;

public class IkunEight {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = countNums(nums);
        Map.Entry<Integer,Integer> entry=null;
        for (Map.Entry<Integer,Integer> entry1 : map.entrySet()){
            if (entry==null || entry1.getValue()>entry.getValue()){
                entry=entry1;
            }
        }
        return entry.getKey();
    }
    
    public static Map<Integer,Integer> countNums(int[] nums){
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        return map;
    }
}
