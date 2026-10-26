import java.util.*;

public class Main {
    //Using HashMap
    public static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();


        for(int num: nums1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num: nums2){
            if(map.containsKey(num) && map.get(num)>0){
              list.add(num);
              map.put(num, map.get(num)-1);
            }
        }

        int[] result=new int[list.size()];

        for(int i=0; i<list.size(); i++){
          result[i]=list.get(i);
        }
        return result;

    }
    
    //Without Using HashMap
    public static int[] intersectOne(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list=new ArrayList<>();

        int i=0; int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
              list.add(nums1[i]);
              i++;
              j++;
            }
            else if(nums1[i]<nums2[j]){
              i++;
            }else{
              j++;
            }
        }
        int[] result=new int[list.size()];
        for(int k=0; k<list.size(); k++){
          result[k]=list.get(k);
        }return result;
    }



    public static void main(String[] args) {
        int[] nums1={1,2,2,1,4};
        int[] nums2={2,2,3,4};
        int[] result= intersect(nums1, nums2);
        int[] result1= intersectOne(nums1, nums2);
        for(int i=0; i<result.length; i++){
          System.out.print(result[i]+" ");
        }System.out.println();


        for(int i=0; i<result1.length; i++){
          System.out.print(result1[i]+" ");
        }System.out.println();
    }
}
