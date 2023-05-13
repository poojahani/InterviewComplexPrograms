package day1;

public class MatrixProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
  // int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
  
   int[][] matrix2 = {{9,8,7},{6,5,4},{3,2,1}};
  int[][] result= addMatrix(matrix1, matrix2);
  int[][] diffResult =subMatrix(matrix1, matrix2);
  boolean equality =equalCheck(matrix1, matrix2);
   System.out.println("Matrix 1");
   printMatrix(matrix1);
   System.out.println("matrix 2");
   printMatrix(matrix2);
   System.out.println("Sum of Matrix :");
   printMatrix(result);
   System.out.println("Difference of Matrix :");
   printMatrix(diffResult);
   System.out.println("matrix equality check");
   if(equality) {
	   System.out.println("The matrix are equal");
   }else {
	   System.out.println("The matrix are not equal");
   }
	}
	
   public static int[][]addMatrix(int[][] matrix1,int[][] matrix2) {
	   int rows =matrix1.length;
	   int cols =matrix1[0].length;
	   int[][] result =new int[rows][cols];
	   
	   for(int i=0;i<rows;i++) {
		   for(int j=0;j<cols;j++) {
			   result[i][j]=matrix1[i][j]+matrix2[i][j];
		   }
	   }
	return result;	     
   }
    public static void printMatrix(int[][] matrix) {
    	int rows =matrix.length;
    	int cols =matrix[0].length;
    	
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<cols;j++) {
    			System.out.print(matrix[i][j]+" ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    }
    
    public static int[][] subMatrix(int[][]matrix1,int[][]matrix2){    	
    	int rows =matrix1.length;
    	int cols =matrix1[0].length;
    	int[][] result =new int[rows][cols];
    	
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<cols;j++) {
    			result[i][j]=matrix2[i][j]-matrix1[i][j];
    		}
    	}
		return result;
    }
    
    public static boolean equalCheck(int[][]matrix1,int[][]matrix2){
    	int rows =matrix1.length;
    	int cols =matrix1[0].length;
    	if(rows!=matrix2.length || cols!=matrix2[0].length) {
			return false;	
		}
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<cols;j++) {
    			if(matrix1[i][j]!=matrix2[i][j]) {
    				return false;
    			}	
    			}
    	}
    	return true;
    	}
}
