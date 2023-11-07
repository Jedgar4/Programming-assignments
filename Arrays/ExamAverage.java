import java.util.Scanner;
import java.util.Arrays;

public class ExamAverage
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of scores: ");
      int num = scan.nextInt();

 
    int[] scores = new int[num ];
    
    for(int i = 0; i < scores.length; i++)
    {
      System.out.print("Enter next score: ");
      scores[i] = scan.nextInt();
    }
     
    double average = averager( scores );
    int High =  Highestscore(scores);
    
    System.out.println(average);
    System.out.println(High);
  
   }
   public static double averager(int[] arr)
   {
      double sum = 0.0;
      for( int val : arr )
      
      sum=sum+val;
      
      return sum/arr.length;
      
   }
   public static int Highestscore(int[] arr)
   {
      int max = arr[0];
      for( int i = 0; i < arr.length; i++)
      {
      if( arr[i] > max )
      max = arr[i];
      }
     
      
      return max;
      
   }
   
   
}