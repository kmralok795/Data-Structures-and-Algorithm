class Main{
    
    public static int[] nextPermutation(int[] nums){
        int n=nums.length;
        int pivot=-1;
        for(int i=n-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums, 0, n-1);
            return nums;
        }
        int swapIndex=pivot;
        for(int i=n-1; i>pivot; i--){
            if(nums[i]>nums[pivot]){
                swapIndex=i;
                break;
            }
        }
        
        swap(nums, pivot, swapIndex);
        reverse(nums, pivot+1, n-1);
        return nums;
    }
    
    
    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public static void reverse(int[] nums, int left, int right){
        while(left<right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    public static void main(String ar[]){
        int[] nums={2,1,3};
        int[] result=nextPermutation(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
