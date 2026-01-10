class missingNumber{
  public static int missingNumber(int[] nums){
    int n=nums.length;
    int totalSum=n*(n+1)/2;
    int actualSum=0;
    for(int i=0; i<n; i++){
      actualSum+=nums[i];
    }
    return actualSum-totalSum;
  } 
  
  
  public static int missingNumberOptimal(int[] nums){
    int xor=0;
    int n=nums.length;
    for(int i=0; i<=n; i++){
      xor^=i;
    }
    
    for(int num: nums){
      xor^=num;
    }return xor;
  }
  public static void main(String ar[]){
    int[] nums={1,2,3,4};
    int[] nums1={3,0,1};
    System.out.println("Missing Number: "+missingNumber(nums));
    System.out.println("Missing Number: "+missingNumberOptimal(nums));
    System.out.println("Missing Number: "+missingNumberOptimal(nums1));
  }
}
