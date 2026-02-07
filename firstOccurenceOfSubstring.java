class Main{
  
  public static int firstOccurenceOfStringBrute(String str, String needle){
    int m=str.length();
    int n=needle.length();
    
    for(int i=0; i<=m-n; i++){
      int j=0;
      
      while(j<n && str.charAt(i+j)==needle.charAt(j)){
        j++;
      }
      
      if(j==n){
        return i;
      }
    }return -1;
  }
  
  
  
  
  public static int firstOccurenceOfStringBetter(String str, String needle){
    int m=str.length();
    int n=needle.length();
    for(int i=0; i<=m-n; i++){
      if(str.substring(i, i+n).equals(needle)){
        return i;
      }
    }return -1;
  }
  
  
  
  
  public static int firstOccurenceOfStringOptimal(String str, String needle){
    return str.indexOf(needle);
  }
  public static void main(String ar[]){
    System.out.println(firstOccurenceOfStringBrute("SadButSad", "Sad"));
    System.out.println(firstOccurenceOfStringBetter("SadButSad", "Sad"));
    System.out.println(firstOccurenceOfStringOptimal("SadButSad", "Sad"));
  }
}
