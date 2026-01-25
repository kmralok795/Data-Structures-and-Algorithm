class Main{
  public static void printArray(int[] nums){
    for(int i=0; i<nums.length; i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
  public static void sortColorsBrute(int[] nums){
    int count1=0, count2=0, count3=0;
    for(int i=0; i<nums.length; i++){
        if(nums[i]==0){
          count1++;
        }else if(nums[i]==1){
          count2++;
        }else{
          count3++;
        }
    }
    
    int idx=0;
    for(int i=0; i<count1; i++){
        nums[idx++]=0;
    }
    for(int i=0; i<count1; i++){
        nums[idx++]=1;
    }
    for(int i=0; i<count1; i++){
        nums[idx++]=2;
    }
    
    printArray(nums);
  }
  
  
  
  public static void sortColorsOptimal(int[] nums){
    int mid=0;
    int high=nums.length-1;
    int low=0;
    while(mid<=high){
      if(nums[mid]==0){
        int temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
        
        low++;
        mid++;
      }else if(nums[mid]==1){
                mid++;
      }else{
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;

            high--;
      }
    }printArray(nums);
  }
  public static void main(String ar[]){
     int[] nums={2,0,2,1,1,0};
     sortColorsBrute(nums);
     
     sortColorsOptimal(nums);
  }
}
