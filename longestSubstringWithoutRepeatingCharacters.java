import java.util.*;
class Main{
    
    public static int lengthOfLongestSubstringBrute(String str){
        int maxLen=0;
        for(int i=0; i<str.length(); i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i; j<str.length(); j++){
                if(set.contains(str.charAt(j))){
                    break;
                }set.add(str.charAt(j));
                
                maxLen=Math.max(maxLen, j-i+1);
            }
        }return maxLen;
    }



    public static int lengthOfLongestSubstringOptimal(String s){
        
        HashMap<Character, Integer> map=new HashMap<>();
        char[] arr=s.toCharArray();
        
        
        
        int res=0;
        int left=0;
        int right=0;
        
        for(; right<arr.length; right++){
            int idx=map.getOrDefault(arr[right], -1);
            if(idx!=-1 && idx>=left){
                res=Math.max(res, right-1-left+1);
                left=idx+1;
            }map.put(arr[right], right);
        }return Math.max(res, right-1-left+1);
    }
    public static void main(String ar[]){
        String str="abcabcbb";
        System.out.println("Longest Substring with no repeating characters: "+lengthOfLongestSubstringBrute(str));
        System.out.println("Longest Substring with no repeating characters: "+lengthOfLongestSubstringOptimal(str));
    }
}
