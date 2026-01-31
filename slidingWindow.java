class Main{
  public static int maximumSumSubarraySumOfSizeK(int[] nums, int k){
    int i=0;
    int j=0;
    int sum=0;
    int maxSum=Integer.MIN_VALUE;
    int n=nums.length;
    while(j<n){
      sum+=nums[j];
      if(j-i+1<k){
        j++;
      }else{
        maxSum=Math.max(maxSum, sum);
        sum-=nums[i];
        i++;
        j++;
      }
    }return maxSum;
  }
  
  
  public static int maximumSumSubarray(int[] nums, int k){
    int i=0;
    int sum=0;
    int maxSum=0;
    for(int j=0; j<nums.length; j++){
        sum+=nums[j];
        while(sum>k){
          sum-=nums[i];
          i++;
        }
        maxSum=Math.max(maxSum, sum);
    }
    return maxSum;
  }
  public static void main(String ar[]){
    int[] nums={2, 1, 5, 1, 3, 2};
    int k=3;
    System.out.println("Maximum Sum: "+maximumSumSubarraySumOfSizeK(nums, k));
    System.out.println("Maximum Sum: "+maximumSumSubarray(nums, 4));
  }
}
