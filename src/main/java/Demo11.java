import java.util.Arrays;

public class Demo11 {
    public static void main(String[] args) {
        nextPermutation(new int[]{1,3,2});
    }
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(i==0){
                Arrays.sort(nums);
                return;
            }else{
                if(nums[i]>nums[i-1]){
                    Arrays.sort(nums,i,n);
                    for(int j=i;j<n;j++) if(nums[j]>nums[i-1]){
                        int temp=nums[j];
                        nums[j]=nums[i-1];
                        nums[i-1]=temp;
                        return;
                    }
                }
            }
        }
    }
}
