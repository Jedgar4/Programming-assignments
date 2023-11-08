public class Card
{

  private String rank, suit; 
  private int value;
      
  public Card(String a, String b)
  {
      this.rank = a;
      this.suit = b;
      setValue();   
  }
  private void setValue()
  {
      switch(this.rank.toLowerCase())
      {
         case "ace": this.value = 1;
         break;
         case "two": this.value = 2;
         break;
         case "three" this.value = 3;
         break;
         case "king": this.value = 10;
         break;
         
      }    
  }
  
  //Override
  public String toString()
  {
      return "Card " + this.rank + " of " + this.suit + "\nvalue " + this.value;
  }

}