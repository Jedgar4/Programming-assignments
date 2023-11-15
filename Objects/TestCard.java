import java.util.Scanner;

public class TestCard
{
   public static void main(String[] args)
   {
   playBlackJack();

      

   }
   public static Card randomcard()
   {
      int randrank = (int)(13*Math.random());
      int randsuit = (int)(4*Math.random());
      
      String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
      
      return new Card(rank[randrank], suit[randsuit] );
      
      
   }
   public static void playBlackJack()
   {     
      System.out.print("Your cards" + randomcard() + randomcard());

   }
   
   
   
   
}