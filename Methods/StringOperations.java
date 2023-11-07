import java.util.Scanner;

public class StringOperations
{
   public static void main(String[] args)
   {
     String user;
     char ch;
     
     Scanner scan = new Scanner(System.in);
     System.out.print("Input a String: ");
     user = scan.nextLine(); 
     System.out.print("Input a ch: ");
     ch = scan.next().charAt(0); 
     
     reverse(user);
     System.out.println(validatePassword(user));
     countLetters(user);
     count(user, ch);
     
     
   }
  
   public static void reverse(String user)
   {
      
      int count = 0;
      char ch;
      String rev = "";
      
      for(int i = user.length()-1; i >= 0; i--)
      {
       ch = user.charAt(i);
       rev +=ch;
       

       
      } 
       System.out.println(rev);
   }
   public static void count(String user, char ch)
   {
      
      int count = 0;
      
      for(int i = 0; i< user.length(); i++)
      {
         if(user.charAt(i) == ch)
         count ++;      
      } 
      System.out.println(count);
   }
    public static boolean validatePassword(String user)
   {
     
      
      int count = 0;
      int lcount  = 0;
      boolean val = false;
      
      for(int i = 0; i< user.length(); i++)
      {
         if(user.charAt(i) == '0' || user.charAt(i) =='1'||user.charAt(i) =='2'||user.charAt(i) =='3'||user.charAt(i) =='4'||
         user.charAt(i) =='5'||user.charAt(i) =='6'||user.charAt(i) =='7'||user.charAt(i) =='8'||user.charAt(i) =='9')
         count ++;
   
        lcount++;
 
      }
     if( lcount >= 8 && count >=2)
       {
       val = true;
       }
      
       return val;
   }
   public static void countLetters(String user)
   {
      
      int lowercount = 0;
      int uppercount = 0;
      
      for(int i = 0; i< user.length(); i++)
      {
         char String = user.charAt(i);
      
         if(String != ' ' && user.charAt(i) !='.' && Character.isLowerCase(String))
         lowercount ++; 
         
         if(user.charAt(i) != ' ' && user.charAt(i) !='.' && Character.isUpperCase(String))
         uppercount ++;       
      } 
      System.out.println("There are are " + lowercount + " lower case letters and " + uppercount + " upper case letters");
   }  
   public static void spacecount(String user)
   {
      
      int count = 0;
      
      for(int i = 0; i< user.length(); i++)
      {
         if(user.charAt(i) == ' ')
         count ++;      
      } 
      System.out.println(count);
   }

   
}
