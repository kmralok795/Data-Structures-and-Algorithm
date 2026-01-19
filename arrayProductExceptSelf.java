class arrayProductExceptSelf{
  public static void printArray(int[] nums){
    for(int i=0; i<nums.length; i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
  
  public static void productOfArrayExceptSelfBrute(int[] nums){
    int n=nums.length;
    int[] ans=new int[n];
    
    for(int i=0; i<n; i++){
      int product=1;
      for(int j=0; j<n; j++){
        if(i==j){
          continue;
        }else{
          product*=nums[j];
        }
      }
      ans[i]=product;
    }printArray(ans);
  }//O(n2) public class 
  
  
  
  
  public static void productOfArrayExceptSelfBetter(int[] nums){
    int n=nums.length;
    int[] ans=new int[n];
    
    int product=1;
    for(int num: nums)
       product*=num;
       
    for(int i=0; i<n; i++){
      ans[i]=product/nums[i];
    }
    
    printArray(ans);
  }//O(n) TC
  
  
  
  
  public static void productOfArrayExceptSelfOptimal(int[] nums){
    int n=nums.length;
    int[] ans=new int[n];
    
    ans[0]=1;
    for(int i=1; i<n; i++){
      ans[i]=ans[i-1]*nums[i-1];
    }
    
    int suffix=1;
    for(int i=n-1; i>=0; i--){
      ans[i]*=suffix;
      suffix*=nums[i];
    }
    printArray(ans);
  }
  
  public static void main(String ar[]){
    int[] nums={1, 2, 3, 4, 5};
    productOfArrayExceptSelfBrute(nums);
    productOfArrayExceptSelfBetter(nums);
    productOfArrayExceptSelfOptimal(nums);
  }
}
