class Solution {
    public static boolean searchInRotatedSortedArrayII(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                return true;
            }
            
          if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
            }else if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
          }else{
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }return false;
    }
    
    public static void main(String ar[]){
      int[] nums={3,1,2,3,3,3,3};
      System.out.println(searchInRotatedSortedArrayII(nums, 2));
      int[] nums1={2,5,6,0,0,1,2};
      System.out.println(searchInRotatedSortedArrayII(nums1, 0));
    }
}
