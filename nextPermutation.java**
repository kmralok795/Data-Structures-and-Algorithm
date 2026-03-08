class Solution {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]){
                j--;
            }

            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
        printArray(nums);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    
    public static void printArray(int[] nums){
      for(int i=0; i<nums.length; i++){
        System.out.print(nums[i]+" ");
      }
      System.out.println();
    }
    public static void main(String ar[]){
      int[] nums={3, 2, 1};
      printArray(nums);
      nextPermutation(nums);
    }
}
