import java.util.*;

public class Main {
    
    public static boolean jumpGameI(int[] arr){
      int maxReach=0;
      for(int i=0; i<arr.length; i++){
        if(i>maxReach){
          return false;
        }

        maxReach=Math.max(maxReach, i+nums[i]);
        if(maxReach==nums.length-1){
          return true;
        }
      }return true;
    }
    public static void main(String[] args) {
       System.out.println("Jump Game: "+jumpGameI([2,3,1,1,4]));
       System.out.println("Jump Game: "+jumpGameI([3,2,1,0,4]));
       System.out.println("Jump Game: "+jumpGameI([0]));
    }
}
