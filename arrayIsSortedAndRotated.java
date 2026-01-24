class Main{
  public static boolean sortedAndRotated(int[] nums){
    int n=nums.length;
    int count=0;
    for(int i=1; i<=n-1; i++){
      if(nums[i-1]>nums[i]){
        count++;
      }
    }
    if(nums[n-1]>nums[0]){
      count++;
    }return count<=1;
  }
  public static void main(String ar[]){
    int[] nums={3, 4, 5, 1, 2};
    int[] nums1={5, 1, 5, 1};
    int[] nums2={1, 2, 3};
    int[] nums3={2, 1, 3, 4, 5};
    System.out.println("Sorted and Rotated: "+sortedAndRotated(nums));
    System.out.println("Sorted and Rotated: "+sortedAndRotated(nums1));
    System.out.println("Sorted and Rotated: "+sortedAndRotated(nums2));
    System.out.println("Sorted and Rotated: "+sortedAndRotated(nums3));
  }
}
