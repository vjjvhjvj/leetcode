package ikun;

public class IkunTwo {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));
    }
    public static int search(int[] nums, int target) {
        int n=nums.length;
        if (n==1) return target==nums[0] ? 0 :-1;
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target)return mid;
            if(nums[0]<=nums[mid]){
                if(nums[0]<=target && nums[mid]>target){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(nums[mid]<target && nums[r]>=target){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}
