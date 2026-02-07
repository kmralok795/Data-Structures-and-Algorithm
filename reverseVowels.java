import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Main{
  
  public static String reverseVowelsBrute(String s){
    List<Character> vowels=new ArrayList<>();
    String vowelSet="aeiouAEIOU";
    
    for(char c: s.toCharArray()){
      if(vowelSet.indexOf(c)!=-1){
        vowels.add(c);
      }
    }
    
    Collections.reverse(vowels);
    
    StringBuilder result=new StringBuilder();
    int idx=0;
    
    for(char c:s.toCharArray()){
      if(vowelSet.indexOf(c)!=-1){
        result.append(vowels.get(idx++));
      }else{
        result.append(c);
      }
    }return result.toString();
  }
  
  
  
  
  
  
  
  //Two Pointer Approach
  public static String reverseVowels(String str){
    char[] arr=str.toCharArray();
    int left=0;
    int right=arr.length-1;
    while(left<right){
       while(left<right && !isVowel(arr[left])){
         left++;
       }
       while(left<right && !isVowel(arr[right])){
         right--;
       }
       
       char temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
       
       left++;
       right--;
    }
    return  new String(arr);
  }
  
  public static boolean isVowel(char c){
    return "aeiouAEIOU".indexOf(c)!=-1;
  }
  public static void main(String ar[]){
     System.out.println(reverseVowelsBrute("IceCreAm"));
     System.out.println(reverseVowels("IceCreAm"));
  }
}
