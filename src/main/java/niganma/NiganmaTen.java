package niganma;

import java.util.ArrayList;
import java.util.List;

public class NiganmaTen {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }



    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for (int i=0;i<=n;i++){
            backtrack(0,i,list,result,nums);
        }
        return result;
    }

    private static void backtrack(int start, int k, List<Integer> list, List<List<Integer>> result, int[] nums) {
        if (k==0){
            result.add(new ArrayList<>(list));
            return;
        }
        int n=nums.length;
        for (int i=start;i<n;i++){
            list.add(nums[i]);
            backtrack(i+1,k-1,list,result,nums);
            list.remove(list.size()-1);
        }
    }


}
