import java.util.HashSet;
import java.util.Arrays;
public class Main {
  public static boolean containsDuplicatesBrute(int[] nums){
    for(int i=0; i<nums.length; i++){
      for(int j=i+1; j<nums.length; j++){
        if(nums[i]==nums[j]){
          return true;
        }
      }
    }return false;
  } 
  
  
  public static boolean containsDuplicatesBetter(int[] nums){
    Arrays.sort(nums);
    for(int i=1; i<nums.length; i++){
      if(nums[i]==nums[i-1]){
        return true;
      }
    }return false;
  } 
  
  
  
  public static boolean containsDuplicatesOptimal(int[] nums){
        HashSet <Integer> set=new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }return false;
  }
    public static void main(String[] args) {
      int[] nums={1, 2, 3, 1};
      System.out.println("Contains Duplicates: "+containsDuplicatesBrute(nums));
      System.out.println("Contains Duplicates: "+containsDuplicatesBetter(nums));
      System.out.println("Contains Duplicates: "+containsDuplicatesOptimal(nums));
  }
}
