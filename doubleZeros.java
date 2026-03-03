class Main{
  public static void printArray(int[] nums){
    for(int i=0; i<nums.length; i++){
      System.out.print(nums[i]+" ");
    }
  }
  public static void doubleZerosBrute(int[] nums){
     for(int i=0; i<nums.length; i++){
       if(nums[i]==0){
         for(int j=nums.length-1; j>i; j--){
           nums[j]=nums[j-1];
         }
         i++;
       }
     }
     printArray(nums);
  }
  
  
  public static void doubleZerosBetter(int[] nums){
    int[] temp=new int[nums.length];
    int i=0; int j=0;
    while(i<nums.length && j<nums.length){
      temp[j]=nums[i];
      
      if(nums[i]==0 && j<nums.length){
        temp[j++]=0;
      }
      i++;
      j++;
    }
    for(i=0; i<nums.length; i++){
      nums[i]=temp[i];
    }
    printArray(nums);
  }
  
  
  
  public static void doubleZerosOptimal(int[] nums){
    int zeros=0;
    for(int num:nums){
      if(num==0) zeros++;
    }
    
    int i=nums.length-1;
    int j=nums.length+zeros-1;
    while(i>=0){
      if(j<nums.length){
        nums[j]=nums[i];
      }
      if(nums[i]==0){
        j--;
        if(j<nums.length){
          nums[j]=0;
        }
      }i--;
      j--;
    }printArray(nums);
  }
  public static void main(String ar[]){
    int[] nums={1, 0, 2, 3, 0, 4, 5, 6, 0, 9};
    int[] nums1={1, 2, 3, 0};
    printArray(nums);
    System.out.println();
    doubleZerosBrute(nums);
    
    System.out.println("\n");
    printArray(nums1);
    System.out.println();
    doubleZerosBrute(nums1);
    
    System.out.println("\n");
    int[] nums2={1, 0, 2, 3, 0, 4, 5, 6, 0, 9};
    printArray(nums2);
    System.out.println();
    doubleZerosBetter(nums2);
    
    System.out.println("\n");
    int[] nums3={1, 0, 2, 3, 0, 4, 5, 6, 0, 9};
    printArray(nums3);
    System.out.println();
    doubleZerosOptimal(nums3);
  }
}
