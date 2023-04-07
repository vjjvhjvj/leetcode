import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo16 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(result-target)>Math.abs(sum-target)){
                    result=sum;
                }else if (sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
