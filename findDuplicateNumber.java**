import java.util.*;

public class Main {
    public static int findDuplicateNumberBrute(int[] nums){
      for(int i=0; i<nums.length-1; i++){
        for(int j=i+1; j<nums.length; j++){
          if(nums[i]==nums[j]){
            return nums[i];
          }
        }
      }return -1;
    }
    
    
    
    public static int findDuplicateNumberBetter(int[] nums){
      Arrays.sort(nums);
      for(int i=0; i<nums.length-1; i++){
        if(nums[i]==nums[i+1]){
          return nums[i];
        }
      }return -1;
    }
    
    
    
    public static int findDuplicateNumberOptimal(int[] nums){
      HashSet<Integer>set=new HashSet<>();
      for(int num: nums){
        if(set.contains(num)){
          return num;
        }
        set.add(num);
      }return -1;
    }
    public static void main(String[] args) {
      int[] nums={ 1, 3, 4, 2, 2};
      System.out.println("Duplicate Number: "+findDuplicateNumberBrute(nums));
      System.out.println("Duplicate Number: "+findDuplicateNumberBetter(nums));
      System.out.println("Duplicate Number: "+findDuplicateNumberOptimal(nums));
    }
}
