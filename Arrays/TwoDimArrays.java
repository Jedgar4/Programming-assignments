import java.util.Scanner;
import java.util.Arrays;

public class TwoDimArrays
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the length of rows: ");
      int num1 = scan.nextInt();
      
      System.out.print("Enter the length of columns: ");
      int num2 = scan.nextInt();
      
      System.out.print("Enter a row or column number: ");
      int num = scan.nextInt();
      
      int matrix1[][] = new int [num1] [num2];
      
      int matrix2[][] = new int [num1][num2];
      
      for(int i= 0; i < matrix1.length; i++)
         {
            
            for (int j = 0; j < matrix1[i].length;j++)
            {
               System.out.print("Enter number: ");
               matrix1[i][j] = scan.nextInt();
            }
         }
         
      for(int i= 0; i < matrix2.length; i++)
         {
            
            for (int j = 0; j < matrix2[i].length;j++)
            {
               System.out.print("Enter number in matrix 2: ");
               matrix2[i][j] = scan.nextInt();
            }
         }

         
     int rowcum =  sumColumn(matrix1, num);    
     System.out.println(rowcum);
    
     int rowsum =  sumRow(matrix1, num);    
     System.out.println(rowsum);
     
     System.out.println(locateLargest(matrix1));
     
     int newmatrix[][] = addMatrix(matrix1, matrix2);
     
     System.out.print(newmatrix.toString());
      


   }
   
   public static int sumRow(int[][] matrix1, int num)
   {
   
      int sum = 0;
      for(int i = 0; i < matrix1.length; i++)
         {
            for (int j = 0; j < num; j++)             
               sum = sum + matrix1 [i][j];           
         }
         
      return sum;
      
   }
   public static int sumColumn(int[][] matrix1, int num)
   {
      int total = 0;
      for (int c = 0; c < matrix1[num].length; c++)      
         for (int r = 0; r < num; r++)
         {
         total = total + matrix1[r][c];
         }
         
      return total;
      

   }
   public static int[][] addMatrix(int [][] matrix1, int[][] matrix2)
   {
      int newmatrix[][] = new int[matrix1.length] [matrix1[0].length];
      
      int total = 0;
      for (int i = 0; i < newmatrix.length; i++) 
         {
            for (int j = 0; j < newmatrix[i].length; j++) 
               {
                  newmatrix[i][j] = matrix1[i][j] + matrix2[i][j];               
               }
         }
      return newmatrix;   
   
   }
   public static int locateLargest(int[][] matrix1)
   {
      int large = matrix1[0][0];
      for (int i =0; i < matrix1.length; i++)
         {
         for(int j = 0; j <matrix1[i].length; j++)
            {
            if(matrix1[i][j] > large)
               large = matrix1[i][j];
            }
         }
     return large;
               
   }


   
    
}