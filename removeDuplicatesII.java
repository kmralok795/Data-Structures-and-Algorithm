import java.util.ArrayList;
import java.util.List;
class main{
  
  public static void printArray(int[] nums){
    for(int i=0; i<nums.length; i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
  public static int removeDuplicatesIIBrute(int[] nums){
    ArrayList<Integer> list=new ArrayList<>();
    int count=1;
    list.add(nums[0]);
    
    for(int i=1; i<nums.length; i++){
      if(nums[i]==nums[i-1]){
        count++;
      }else{
        count=1;
      }
      
      if(count<=2){
        list.add(nums[i]);
      }
    }
    
    
    for(int i=0; i<list.size(); i++){
      nums[i]=list.get(i);
    }
    printArray(nums);
    return list.size();
  }
  
  
  
  public static int removeDuplicatesOptimal(int[] nums){
    if(nums.length<=2){
      return nums.length;
    }
    
    int k=2;
    for(int i=2; i<nums.length; i++){
      if(nums[i]!=nums[k-2]){
        nums[k]=nums[i];
        k++;
      }
    }return k;
  }
  public static void main(String ar[]){
    int[] nums={1, 1, 1, 2, 2, 3};
    int[] nums1={0, 0, 0, 1, 1, 1, 1, 2, 3, 3};
    System.out.println("Brute Force");
    System.out.println(removeDuplicatesIIBrute(nums));
    System.out.println("\n");
    System.out.println(removeDuplicatesIIBrute(nums1));
    
    System.out.println();
    System.out.println("Optimized Approach");
    System.out.println(removeDuplicatesIIBrute(nums));
    System.out.println("\n");
    System.out.println(removeDuplicatesIIBrute(nums1));
  }
}
