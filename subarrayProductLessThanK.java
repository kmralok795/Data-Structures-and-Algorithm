import java.util.*;

public class Main {
  public static int subarrayProductLessThanKBrute(int[] nums, int k){
    int count=0;
  
    
    for(int i=0; i<nums.length; i++){
      int product=1;
      for(int j=i; j<nums.length; j++){
        product*=nums[j];
        if(product<k){
          count++;
        }else{
          break;
        }
      }
    }return count;
  }
  
  
  
  public static int subarrayProductLessThanKOptimal(int[] nums, int k){
     if(k<=1){
       return 0;
     }
     int left=0; 
     int product=1;
     int count=0;
     for(int right=0; right<nums.length; right++){
       product*=nums[right];
       while(product>=k){
         product/=nums[left];
         left++;
       }
       count+=right-left+1;
     }return count;
  }
    public static void main(String[] args) {
      int[] nums={10, 5, 2, 6};
      System.out.println(subarrayProductLessThanKBrute(nums, 80));
      System.out.println(subarrayProductLessThanKOptimal(nums, 80));
    }
}
