package ikun;

import java.util.ArrayList;
import java.util.List;

public class IkunFour {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 5}, 10));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        dfs(candidates,target,0,result,list);
        return result;
    }

    private static void dfs(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> list) {
        if(index==candidates.length){
            return;
        }
        if(target==0){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        //直接跳过
        dfs(candidates,target,index+1,result,list);
        if(target-candidates[index]>=0){
            list.add(candidates[index]);
            dfs(candidates,target-candidates[index],index,result,list);
            list.remove(list.size()-1);
        }
    }
}
