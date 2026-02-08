import java.util.ArrayList;
class Main{
  public static void printArray(ArrayList<Integer>list){
    for(int num:list)
      System.out.print(num+" ");
    System.out.println();
  }
  public static void spiralMatrix(int[][] matrix){
    int startRow=0;
    int endRow=matrix.length-1;
    int startCol=0;
    int endCol=matrix[0].length-1;
    ArrayList<Integer> list=new ArrayList<>();
    while(startRow<=endRow && startCol<=endCol){
      for(int j=startCol; j<=endCol; j++){
        list.add(matrix[startRow][j]);
      }
      for(int i=startRow+1; i<=endRow; i++){
        list.add(matrix[i][endCol]);
      }
      if(startRow<endRow){
        for(int j=endCol-1; j>=startCol; j--){
          list.add(matrix[endRow][j]);
        }
      }
      if(startCol<endCol){
        for(int i=endRow-1; i>startRow; i--){
          list.add(matrix[i][startCol]);
        }
      }
      startRow++;
      endRow--;
      startCol++;
      endCol--;
    }
    
    printArray(list);
  }
  public static void main(String sr[]){
    int[][] matrix={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    int[][] matrix1={{1, 2, 3, 4},{5, 6, 7, 8}};
    int[][] matrix2={{1, 2},{3, 4}};
    int[][] matrix3={{1, 2, 3, 4}};
    int[][] matrix4={{1},{2},{3},{4}};
    spiralMatrix(matrix);
    spiralMatrix(matrix1);
    spiralMatrix(matrix2);
    spiralMatrix(matrix3);
    spiralMatrix(matrix4);
  }
}
