import java.util.*;
class Main{
  public static int longestSubstringWithoutRepeatingCharactersBrute(String str){
    int maxLen=Integer.MIN_VALUE;
    for(int i=0; i<str.length(); i++){
      for(int j=0; j<str.length(); j++){
        HashSet<Character> set=new HashSet<>();
        boolean valid=true;
        
        for(int k=i; k<=j; k++){
          if(set.contains(str.charAt(k))){
            valid=false;
            break;
          }
          set.add(str.charAt(k));
        }
        if(valid){
          maxLen=Math.max(maxLen, j-i+1);
        }
      }
    }return maxLen;
  }
  
  
  
  public static int longestSubstringWithoutRepeatingCharactersBetter(String str){
    if(str.length()==0){
      return 0;
    }
    int maxLen=Integer.MIN_VALUE;
    for(int i=0; i<str.length(); i++){
      int length=0;
      HashSet<Character> set=new HashSet<>();
      for(int j=i; j<str.length(); j++){
        if(set.contains(str.charAt(j))){
          break;
        }
        set.add(str.charAt(j));
        length++;
      }
      maxLen=Math.max(maxLen, length);
    }
    return maxLen;
  }
  
  
  
  public static int longestSubstringWithoutRepeatingCharactersOptimal(String str){
    if(str.length()==0){
      return 0;
    }
    HashSet<Character> set=new HashSet<>();
    int left=0;
    int maxLen=Integer.MIN_VALUE;
    for(int right=0; right<str.length(); right++){
      if(set.contains(str.charAt(right))){
        set.remove(str.charAt(left));
        left++;
      }
      set.add(str.charAt(right));
      maxLen=Math.max(maxLen, right-left+1);
    }
    return maxLen;
  }
  public static void main(String ar[]){
    System.out.println(longestSubstringWithoutRepeatingCharactersBrute("abcabcbb"));
    System.out.println(longestSubstringWithoutRepeatingCharactersBetter("abcabcbb"));
    System.out.println(longestSubstringWithoutRepeatingCharactersOptimal("abcabcbb"));
  }
}
   
