  import java.util.Scanner;

public class SpaceCounter
{
   public static void main(String[] args)
   {
     String user;
     char ch;
     
     Scanner scan = new Scanner(System.in);
     System.out.print("Input a String: ");
     user = scan.nextLine();
     
     spacecount(user);

     
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
