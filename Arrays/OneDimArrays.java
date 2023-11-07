import java.util.Scanner;
import java.util.Arrays;

public class OneDimArrays
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of scores: ");
      int num = scan.nextInt();
      

 
    int[] scores = new int[num ];
    int[] p = new int [num];
    double[] dscores = new double[num ];

    
    for(int i = 0; i < scores.length; i++)
    {
      System.out.print("Enter next score: ");
      scores[i] = scan.nextInt();
    }
    for(int k = 0; k < scores.length; k++)
    {
      System.out.print("Enter other next score: ");
      p[k] = scan.nextInt();
    }

    for(int j = 0; j < scores.length; j++)
    {
    
      System.out.print("Enter next double score: "  );
      dscores[j] = scan.nextDouble();
    }

     
    double average = average( scores );
    int Min =  min(scores);
    double faverage = faverage(dscores);
    boolean val = identical(scores, p);
    
    int [] newarray = marge((scores, p);
    
    System.out.println(average);
    System.out.println(faverage);
    System.out.println(Min);
    System.out.println(val);
    
  
    

  
   }
   public static double average(int[] arr)
   {
      double sum = 0.0;
      for( int val : arr )
      
      sum=sum+val;
      
      return sum/arr.length;
      
   }
   public static double faverage(double[] arr)
   {
      double sum = 0.0;
      for( double val : arr )
      
      sum=sum+val;
      
      return sum/arr.length;
      
   }

   public static int min(int[] arr)
   {
      int min = arr[0];
      for( int i = 0; i < arr.length; i++)
      {
      if( arr[i] < min )
      min = arr[i];
      }
     
      
      return min;
      
   }
   public static boolean identical(int[] scores, int[] p)
   {
    boolean check = Arrays.equals(p, scores);
    
    return check;
    
   
      
   }
   public static void merge(int[] scores, int[] p)
   {
   int a = scores.length;
   int b = p.length;
   
   int c = a + b;
   
   int [] newarray = new int [c];
   
     // Loop to store the elements of first 
        // array into resultant array 
        for (int i = 0; i < a; i = i + 1) { 
            // Storing the elements in  
            // the resultant array 
            newarray[i] = scores[i]; 
        } 
  
        // Loop to concat the elements of second  
        // array into resultant array 
        for (int i = 0; i < b; i = i + 1) { 
  
            // Storing the elements in the  
            // resultant array 
            newarray[a + i] = p[i]; 
        } 
  
        // Loop to print the elements of  
        // resultant array after merging 
        for (int i = 0; i < c; i = i + 1) { 
              
            // print the element 
            System.out.print(newarray[i]); 
        }
   
   }


   
   
}