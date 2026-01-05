class Main{
  
  public static int minimumInRotatedSortedArray(int[] nums, int target){
    int low=0; int high=nums.length-1;
    while(low<=high){
      int mid=low+(high-low)/2;
      if(nums[mid]==target){
        return mid;
      }
      
      if(nums[low]<=nums[mid]){
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
    }return -1;
  }
  public static void main(String ar[]){
    int[] nums={4,5,6,7,0,1,2};
    int[] nums1={6,7,0,1,2,3,4,5};
    System.out.println("Minimum in rotated sorted array: "+minimumInRotatedSortedArray(nums, 0));
    System.out.println("Minimum in rotated sorted array: "+minimumInRotatedSortedArray(nums, 3));
    System.out.println("Minimum in rotated sorted array: "+minimumInRotatedSortedArray(nums1, 4));
  }
}
