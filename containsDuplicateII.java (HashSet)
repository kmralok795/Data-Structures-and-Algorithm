import java.util.HashSet;
class Main{
  public static boolean containsDuplicatesIIBrute(int[] nums, int k){
    for(int i=0; i<nums.length; i++){
      for(int j=i+1; j<nums.length; j++){
        if(nums[i]==nums[j+1] && Math.abs(i-j)<=k){
          return true;
        }
      }
    }return false;
  }
  
  
  public static boolean containsDuplicatesIIOptimal(int[] nums, int k){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0; i<nums.length; i++){
      if(set.contains(nums[i])){
        return true;
      }
      
      set.add(nums[i]);
      if(set.size()>k){
        set.remove(nums[i-k]);
      }
    }return false;
  }
  public static void main(String ar[]){
    int[] nums={1, 2, 3, 1};
    System.out.println("Contains Duplicates: "+containsDuplicatesIIBrute(nums, 3));
    System.out.println("Contains Duplicates: "+containsDuplicatesIIOptimal(nums, 3));
  }
}
