public class Demo19 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }
    public static int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0) return 0;
        int fast=0,slow=0;
        while(fast<n){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
