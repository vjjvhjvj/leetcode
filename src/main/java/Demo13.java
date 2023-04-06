import sun.misc.LRUCache;

public class Demo13 {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{1, 2, 3, 3, 4}, 3));
    }
    public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        if(n==0) return new int[]{-1,-1};
        int l=0,r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                if(nums[l]==target&& nums[r]==target) return new int[]{l,r};
                if(nums[l]!=target) l++;
                if(nums[r]!=target) r--;
            }
        }
        return new int []{-1,-1};
    }


}
