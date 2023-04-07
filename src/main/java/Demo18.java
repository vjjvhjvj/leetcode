public class Demo18 {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int fast=1,slow=1;
        while(fast<n){
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
