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
         case "two": this.value = 2;
         break;
         case "three": this.value = 3;
         break;
         case "four": this.value = 4;
         break;
         case "five": this.value = 5;
         break;
         case "six": this.value = 6;
         break;
         case "seven": this.value = 7;
         break;
         case "eight": this.value = 8;
         break;
         case "nine": this.value = 9;
         break;
         case "ten": this.value = 10;
         break;
         case "jack": this.value = 10;
         break;
         case "queen": this.value = 10;
         break;         
         case "king": this.value = 10;
         break;
         case "ace": this.value = 11;
         break;
         
      }
          
  }
  
  @Override
  public String toString()
  {
      return "Card " + this.rank + " of " + this.suit + "\nvalue " + this.value;
  }

}