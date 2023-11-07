import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Scramble
{
   public static void main(String[] args)
   {
      String check = "computer";
      
      Scramble(check);

      
   }
   public static void Scramble(String check)
   {

    int p = check.length();
      
      String empty = "";
      
      for(int i = 0; i<p; i++)
      
      {
      int rand = (int)(check.length()*Math.random());
      
      char ch = check.charAt(rand);
      
      empty = empty + ch;
      
      check = check.substring(0,rand) + check.substring(1+rand);
      }
      
    System.out.print(empty);
      
   }

      
}