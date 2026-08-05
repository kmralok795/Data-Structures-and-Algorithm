class Main {
    public static int removeElementBrute(int[] nums, int val) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==val){
                for(int j=i; j<n-1l; j++){
                    nums[j]=nums[j+1];
                }
                n--;
                i--;
            }
        }return n;
    }
    
    
    public static int removeElementOptimal(int[] nums, int val){
        int n=nums.length;
        int k=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }return k;
    }
    public static void main(String ar[]){
        int[] nums={1,2,3,4,7,9};
        System.out.println("Original Array Size (Brute Force): "+nums.length);
        System.out.println("Array Size after removal of target value: "+removeElementBrute(nums, 4));
        System.out.println();
        nums=new int[]{1,2,3,4,7,9};
        System.out.println("Original Array Size (Optimal): "+nums.length);
        System.out.println("Array Size after removal of target value: "+removeElementOptimal(nums, 4));
    }
}
