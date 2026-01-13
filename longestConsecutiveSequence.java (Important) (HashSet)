// class cl{
//   public static boolean contains(int[] nums, int target){
//     for(int x: nums){
//       if(x==target) return true;
//     }return false;
//   }
//   public static int longestConsecutiveSequence(int[] nums){
//       if(nums.length==0){
//         return 0;
//       }
//       int n=nums.length;
//       int longest=1;
//       for(int i=0; i<nums.length; i++){
//         int curr=nums[i];
//         int count=1;
        
//         while(contains(nums, curr+1)){
//           curr++;
//           count++;
//         }
//         longest=Math.max(longest, count);
//       }return longest;
//   }
//   public static void main(String ar[]){
//     int[] nums={100, 102, 103, 4, 104, 5, 2, 3, 1, 6};
//     System.out.println("Longets Consecutive Sequence: "+longestConsecutiveSequence(nums));
//   }
// }
//Brute Force 
//TC: O(n2)
//TC: O(1)




// import java.util.Arrays;
// class Main{
//     public static int longestConsecutiveSequence(int[] nums){
//         if(nums.length==0){
//             return 0;
//         }
//         Arrays.sort(nums); //O(n log n)

//         int count=1;
//         int longest=1;
//         for(int i=1; i<nums.length; i++){ //O(n)
//             if(nums[i]==nums[i-1]){
//                 continue;
//             }
//             else if(nums[i]==nums[i-1]+1){
//                 count++;
//                 longest=Math.max(count, longest);
//             }else{
//                 count=1;
           
//             }
//         }return longest;
//     }
//     public static void main(String ar[]){
//          int[] nums={100, 102, 103, 4, 104, 5, 3, 2, 1, 6};
//          System.out.println("Logest Consecutive Sequence: "+longestConsecutiveSequence(nums));
//     }
// }
//O(n log n) TC







import java.util.HashSet;
import java.util.Set;
class longestConsecutiveSequence{
 public static int longestConsecutiveOptimal(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int x : nums) {
        set.add(x);
    }

    int longest = 0;

    for (int x : set) {
        // check if x is the start of a sequence
        if (!set.contains(x - 1)) {
            int curr = x;
            int count = 1;

            while (set.contains(curr + 1)) {
                curr++;
                count++;
            }
            longest = Math.max(longest, count);
        }
    }
    return longest;
 }
 public static void main(String ar[]){
    int[] nums={101, 102, 103, 4, 104, 5, 3, 2, 1, 6};
    System.out.println("Longest Consecutive Sequence: "+longestConsecutiveOptimal(nums));
 }
}
//O(n) TC
