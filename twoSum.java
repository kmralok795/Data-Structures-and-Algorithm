import java.util.HashMap;
class Main{
    public static int[] twoSumBrute(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
          for(int j=i+1; j<nums.length; j++){
              if(nums[i]+nums[j]==target){
                  return new int[]{i,j}; 
              }
          }
        }return new int[]{-1,-1};
    }
    
    
    
    public static int[] twoSumOptimal(int[] nums, int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }return new int[]{-1,-1};
        
    }
    public static void main(String ar[]){
        int[] nums={1,3,5,4};
        int[] result=twoSumBrute(nums,9);
        int[] result1=twoSumOptimal(nums,9);
        System.out.println("Indices: "+result[0]+","+result[1]);
        System.out.println("Indices: "+result1[0]+","+result1[1]);
    }
}
