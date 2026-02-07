class Main{
  public static void printArray(char[] ch){
    for(int i=0; i<ch.length; i++){
      System.out.print(ch[i]+" ");
    }
  }
  public static void reverseCharacterArray(char[] ch){
    int left=0;
    int right=ch.length-1;
    while(left<=right){
      char temp=ch[left];
      ch[left]=ch[right];
      ch[right]=temp;
      
      left++;
      right--;
    }
    printArray(ch);
  }
  public static void main(String ar[]){
    char[] str={'h','e','l','l','o'};
    reverseCharacterArray(str);
  }
}
