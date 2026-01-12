class Main{
  public static boolean searchATwoDMatrixBrute(int[][] matrix, int target){
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        if(matrix[i][j]==target){
          return true;
        }
      }
    }return false;
  }
  
  
  
  public static boolean searchATwoDMatrixBetter(int[][] matrix, int target){
    int m=matrix.length;
    int n=matrix[0].length;
    for(int i=0; i<m; i++){
      int low=0;
      int high=n-1;
      while(low<=high){
          int mid=low+(high-low)/2;
          if(matrix[i][mid]==target){
            return true;
          }else if(target<matrix[i][mid]){
            high=mid-1;
          }else{
            low=mid+1;
          }
      }
    }return false;
  }
  
  
  
  public static boolean searchATwoDMatrixOptimal(int[][] matrix, int target){
    int m=matrix.length; 
    int n=matrix[0].length;
    
    int row=0;
    int col=n-1;
    while(row<m && col>=0){
      if(matrix[row][col]==target){
        return true;
      }else if(target>matrix[row][col]){
        row++;
      }else{
        col--;
      }
    }return false;
  }
  
  
  
  public static void main(String ar[]){
    int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    System.out.println("Search a 2-D Matrix: "+searchATwoDMatrixBrute(matrix, 27));
    System.out.println("Search a 2-D Matrix: "+searchATwoDMatrixBetter(matrix, 5));
    System.out.println("Search a 2-D Matrix: "+searchATwoDMatrixBetter(matrix, 20));
    System.out.println("Search a 2-D Matrix: "+searchATwoDMatrixOptimal(matrix, 20));
  }
}
