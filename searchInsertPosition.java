public class Main {
  
  public static int searchInsertPosition(int[] nums, int k){
    for(int i=0; i<nums.length; i++){
      if(nums[i]>=k){
        return i;
      }
    }return -1;  
  }
  public static int searchInsertPositionOptimal(int[] nums, int k){
    int low=0;
    int high=nums.length-1;
    while(low<=high){
      int mid=low+(high-low)/2;
      
      if(k>nums[high]){
        return high+1;
      }else if(k<nums[low]){
        return low;
      }
      if(nums[mid]==k){
        return mid;
      }else if(nums[mid]>k){
        high=mid-1;
      }else{
        low=mid+1;
      }
    }return -1;
  }
    public static void main(String[] args) {
      int[] nums={1,3,5,6};
      System.out.println("Search insert position: "+searchInsertPosition(nums, 2));
      System.out.println("Search insert position: "+searchInsertPositionOptimal(nums, 0));
  }
}
