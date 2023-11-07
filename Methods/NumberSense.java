

import java.util.Scanner;
import java.util.Arrays;

public class NumberSense
{
   public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    String word;
    int nums;
    int num1;
    float num2;
    float num3;
    int A;
    int B;
    int C;
    
    
    System.out.print("Enter a String: ");
    word = scan.nextLine();
    System.out.print("Enter a Prime num: ");
    num1 = scan.nextInt();
    System.out.print("Enter a sum num: ");
    nums = scan.nextInt();
    System.out.print("Enter a Temp F: ");
    num2 = scan.nextFloat();
    System.out.print("Enter a Temp C: ");
    num3 = scan.nextFloat();
    System.out.print("Enter an int1: ");
    A = scan.nextInt();
    System.out.print("Enter an int2: ");
    B = scan.nextInt();
    System.out.print("Enter an int3: ");
    C = scan.nextInt();




    
    reverse(word);
    isPalindrome(word);
    isPrime(num1);
    sumDigits(nums);
    FahrenheitToCelsius( num2);
    CelsiusToFahrenheit( num3);
    AscendingOrder( A, B, C);
      
   }
   
   public static void reverse( String word)
   {
    
        String space = "";
        char ch;
      
       for (int i=0; i<word.length(); i++)
        {
         ch= word.charAt(i); 
         space= ch+space; 
         }
          
       System.out.println("String in reverse: " + space);
      
    }
    public static void isPalindrome( String word)
    {
       
        String space = "";
        char ch;
        String check = word;
          
       for (int i=0; i<word.length(); i++)
         {
         ch= word.charAt(i); 
         space= ch+space; 
         }
         boolean pal = space.equals(check);
           
       System.out.println(pal);
        
    }
    
    public static void isPrime( int num1)
    {
         boolean prime;
         prime = true;  
         if(num1<=1)      
         {
            prime = false;
         }   
          for (int i = 2; i <= num1/2; i++)
          {
             if ((num1 % i) == 0)
                  prime = false;         
          } 
          System.out.println(prime);    
    }
      
    public static void sumDigits( int nums)
   {
         int sum = 0;
         
        
          while(nums !=0)
          {
          sum = sum + nums %10;
          nums = nums/10;        
          } 
          System.out.println(sum);    
   }
   
    public static void FahrenheitToCelsius( float num2)
   {
         float F = num2;
         float C = 0f;
         C = ((F - 32) * 5 / 9); 
      
         System.out.printf("%.1f degF is %.1f degC.%n", F, C);         
        
  
   }
   public static void  CelsiusToFahrenheit( float num3)
   {
         float C = num3;
         float F = 0f;
         F = ((C * 9 / 5) + 32 ); 
      
         System.out.printf("%.1f degC is %.1f degF.%n", C, F);         
        
  
   }
    public static void  AscendingOrder( int A, int B, int C)
   {
    int arr[] = new int [] {A, B, C};
    
    Arrays.sort(arr);
     {
         System.out.printf("Order ascending: %d, %d, %d%n", arr[0], arr[1], arr[2]);    
     }      
  
   }


}
