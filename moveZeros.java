import java.util.*;

public class Main {
  
  public static void printArr(int[] nums){
    for(int i=0; i<nums.length; i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
  public static void moveZeros(int[] nums){
    int n=nums.length;
    int[] newArr=new int[n];
    int idx=0;
    
    
    for(int i=0; i<nums.length; i++){
      if(nums[i]!=0){
        newArr[idx++]=nums[i];
      }
    }
    
    while(idx<n){
    newArr[idx++]=0;
    }
    printArr(newArr);
    
  }
  
  
  
  
  public static void moveZerosOptimal(int[] nums){
    int n=nums.length; 
    int idx=0;
    
    for(int i=0; i<nums.length; i++){
      if(nums[i]!=0){
        nums[idx++]=nums[i];
      }
    }
    while(idx<n){
      nums[idx++]=0;
    }
    printArr(nums);
  }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeros(nums);
        moveZerosOptimal(nums);
  }
}
