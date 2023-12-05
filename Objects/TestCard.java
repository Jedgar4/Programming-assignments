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
      Scanner scan = new Scanner(System.in);
      
      int playerscore = 0;
      int dealerscore = 0;
      int score = 0;
      char user;
      
      
      Card playercard1 = randomcard();
      Card playercard2 = randomcard();
      Card dealercard1 = randomcard();
      Card dealercard2 = randomcard();
      Card playercard3;
      Card dealercard3;
      
      if(playerscore >21)
      {
         if(playercard1.getValue() == 11)
         {
            playercard1.AceDown();
            
            playerscore -= 10;
         }
         if(playercard2.getValue() == 11)
         {
            playercard2.AceDown();
            
            playerscore -= 10;
         }
       }
      if(dealerscore >21)
      {
         if(dealercard1.getValue() == 11)
         {
            dealercard1.AceDown();
            
            dealerscore -= 10;
         }
         if(dealercard2.getValue() == 11)
         {
            dealercard2.AceDown();
            
            dealerscore -= 10;
         }

         
      }
      
      playerscore =+ playercard1.getValue() + playercard2.getValue();
      
      dealerscore =+ dealercard1.getValue();
        
      System.out.printf("Your Cards:%n%s %s%n%d%n%n", playercard1, playercard2, playerscore);
      System.out.printf("Dealer's Cards:%n%s%n%d%n%n", dealercard1 , dealerscore);
      
      dealerscore = dealerscore + dealercard2.getValue();
      
      if(playerscore ==21 && dealerscore != 21)
      {
         System.out.printf("Blackjack! You win!");
   
      }
      if(playerscore ==21 && dealerscore == 21)
      {
         System.out.printf("Draw. Dealer has blackjack.");   
      }
      if(dealerscore ==21 && playerscore != 21)
      {
          System.out.printf("Dealer has blackjack."); 
      }
      
      if(playerscore != 21 && dealerscore != 21)
      {
      
      while(score != 4)
      {
         System.out.println("Would you like to hit: y/n");
         user = scan.next().charAt(0);
         
         if(user == 'n')
         {
            break;
         }
         
         playercard3 = randomcard();
         
         playerscore = playerscore + playercard3.getValue();
         
         if(playerscore > 21)
         {
         
           if(playercard1.getValue() == 11)
           {
               playercard1.AceDown();
               playerscore -= 10;
           }
           if(playercard2.getValue() == 11)
           {
                  playercard2.AceDown();    
                  playerscore -= 10;
           }
           if(playercard3.getValue() == 11)
           {
             playercard3.AceDown();    
             playerscore -= 10;
           }
         }

         
         
         System.out.printf("%n%s %d%n", playercard3, playerscore);
             
         if(playerscore > 21)
         {
           
           System.out.println("Busted! You lose!");
           break;                 
         }         
          score=+ 1; 
                     
      }
      
      if(score == 4)
      {
         System.out.println("Six Card Charlie! You win!");
         scanner.close();
      }
      
      if(playerscore <22 && score != 4)
      {
      
         System.out.printf("Dealer's Cards:%n%s %s%n%d%n%n", dealercard1 , dealercard2, dealerscore);
         
         if(dealerscore <= 17)
         {
            while(dealerscore < 17)
            {
               dealercard3 = randomcard();
               
               dealerscore = dealerscore + dealercard3.getValue(); 
               
               if(dealerscore > 21)
               {
                  if(dealercard1.getValue() == 11)
                  {
                     dealercard1.AceDown();                    
                     dealerscore -= 10;
                  }
                  if(dealercard2.getValue() == 11)
                  {
                     dealercard2.AceDown();                     
                     dealerscore -= 10;     
                  }
                  if(dealercard3.getValue() == 11)
                  {
                     dealercard3.AceDown();    
                     dealerscore -= 10;
                  }
                }
               
               System.out.printf("%s %d%n", dealercard3, dealerscore);
                   
               if(dealerscore > 21) 
               {          
                  System.out.println("Dealer Busted! You win!");
                  break;                 
               }   
            }
         }
         
         if(playerscore < dealerscore && dealerscore <= 21 && score != 4)
         {
            System.out.println("Dealer wins.");
         }
         if(playerscore > dealerscore && playerscore <= 21 && score != 4)
         {
            System.out.println("You win.");
         }
         if(playerscore == dealerscore && score != 4 )
         {
            System.out.println("Draw.");
         }
      }
   
    }
   }  
   
}
