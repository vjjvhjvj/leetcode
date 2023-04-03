public class Demo10 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,3,1,2}));
    }

    public static int singleNumber(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
