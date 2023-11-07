import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class LastF_Capitals
{
   public static void main(String[] args)
   {
      

      String scrambledCity;
      
      String[] citiesArray = readData( "Capitals.csv" );
      String[] statesArray = readData( "States.csv" );
      
      int rand = (int)(50*Math.random());
      
      String randomCity = citiesArray[rand];
      String randomState = statesArray[rand];
      
      int Words = (countSpaces(randomCity));
           
      
      int score = 0;
      int tries = 3;
      
     
      do
         {
      
          scrambledCity = scramble(randomCity);
          
           String guess = displayWord(tries, Words, scrambledCity, randomState );
   
      
         if( guess.equals( randomCity ) )
         {
            System.out.println("correct guess: " + guess);
            
            score = score +1;
            
            rand = (int)(50*Math.random());
            
            randomCity = citiesArray[rand];
            randomState = statesArray[rand];
            
            Words = (countSpaces(randomCity) );
         
         }else
         {
          tries = tries -1;
         
         }
         }while( tries > 0 );
      
      System.out.printf("Your final score is %d%n", score); 
      System.out.println( Arrays.toString(citiesArray));
      System.out.println( Arrays.toString(statesArray));
 
      
   } 
 
   public static String displayWord(int tries, int Words, String scrambledCity, String randomState)
   {
      String message = String.format("Tries left %d%nNumber of words %d%nScrambled City %s%nState %s ",tries, Words, scrambledCity, randomState );
      
      String input = JOptionPane.showInputDialog(null, message);
      
      return input;
      
   }
   
 
   public static int countSpaces(String randomCity)
   {
    
      int count = 1;
      
      for(int i = 0; i< randomCity.length(); i++)
      {
         if(randomCity.charAt(i) == ' ')
         count ++;      
      } 
      
      return count;

   }
 
   public static String scramble( String randomCity )
   {
      int p = randomCity.length();
      
      String empty = "";
      
      for(int i = 0; i<p; i++)
      
      {
         int rand = (int)(randomCity.length()*Math.random());
         
         char ch = randomCity.charAt(rand);
         
         empty = empty + ch;
         
         randomCity = randomCity.substring(0,rand) + randomCity.substring(1+rand);
      }
 
      
      return empty;

   } 
   public static String[] readData( String filename )
   {
      String[] arrayOfStrings;
      try
      {
    
      Scanner scanner = new Scanner( new File(filename) );
    
      int numStrings = scanner.nextInt();
   
      arrayOfStrings = new String[numStrings];
     
      int i = 0;
    
      while( scanner.hasNextLine() && i < numStrings )
      {
         String str = scanner.nextLine().toLowerCase();
         if( str.length() != 0 )
      {
   
         arrayOfStrings[i] = str;
         i++;
      }
   }

   scanner.close();
   }catch( FileNotFoundException e )
   {
 
      arrayOfStrings = null;
      System.out.println( filename + " not found" );
   }

   return arrayOfStrings;
   }
}
