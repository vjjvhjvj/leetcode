package niganma;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.*;



public class NiganmaTwelve {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //数组长度
        int n = nums.length;
        boolean[] res = new boolean[n];
        Deque<Integer> stack=new ArrayDeque<>();
        dfs(nums, n, result,  0,res,stack);
        return result;
    }

    private static void dfs(int[] nums, int n, List<List<Integer>> result,  int depth, boolean[] res, Deque<Integer> stack) {
        if (depth==n){
            result.add(new ArrayList<>(stack));
            return;
        }
        for (int i=0;i<n;i++){
            if (res[i]){
                continue;
            }
            stack.addLast(nums[i]);
            res[i]=true;
            dfs(nums, n, result,  depth+1, res, stack);
            stack.removeLast();
            res[i]=false;
        }
    }
}
