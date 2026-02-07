import java.util.HashSet;
import java.util.Arrays;
class Main{
  
  
  public static void printArray(int[] nums){
    for(int i=0; i<nums.length; i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
  public static void intersectionOfArrays(int[] nums1, int[] nums2){
    HashSet<Integer> set=new HashSet<>();
    
    for(int i=0; i<nums1.length; i++){
      for(int j=0; j<nums2.length-1; j++){
        if(nums1[i]==nums2[j]){
          set.add(nums1[i]);
        }
      }
    }
    
    int[] result=new int[set.size()];
    int k=0;
    for(int num:set){
      result[k++]=num;
    }
    printArray(result);
  }
  
  
  
  
  
  
  public static void intersectionOptimalOne(int[] nums1, int[] nums2){
    HashSet<Integer> set1=new HashSet<>();
    HashSet<Integer> resultSet=new HashSet<>();
    
    for(int num:nums1){
      set1.add(num);
    }
    
    
    for(int num:nums2){
      if(set1.contains(num)){
        resultSet.add(num);
      }
    }
    
    
    int[] result=new int[resultSet.size()];
    int i=0;
    for(int num:resultSet){
      result[i++]=num;
    }
   printArray(result);
  }
  
  
  
  
  //Two Pointer
  public static void intersectionOptimalTwo(int[] nums1, int[] nums2){
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    
    HashSet<Integer> set=new HashSet<>();
    int i=0;
    int j=0;
    while(i<nums1.length && j<nums2.length){
      if(nums1[i]==nums2[j]){
        set.add(nums1[i]);
        i++;
        j++;
      }else if(nums1[i]<nums2[j]){
        i++;
      }else{
        j++;
      }
    }
    
    int[] result=new int[set.size()];
    int k=0;
    for(int num:set){
      result[k++]=num;
    }
    printArray(result);
  }
  public static void main(String ar[]){
    int[] nums1={1, 2, 2, 3, 4, 5, 6};
    int[] nums2={2, 2, 4, 9, 13};
    intersectionOfArrays(nums1, nums2);
    intersectionOptimalOne(nums1, nums2);
    intersectionOptimalTwo(nums1, nums2);
  }
}
