import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class dTictacToe extends Application
{
   private Parent createContent()
   {
      Pane root = new Pane();
      root.setPrefSize(600, 600);
      
      return root;
   }
   private class Tile extends StackPane
   {
      public Tile()
      {
         Rectangle border = new Rectangle(200, 200);
         border.setFill(null);
         border.setStroke(Color.BLACK);
         
         setAlignment(Pos.CENTER);
         getChildren().addAll(border);
         
      }
   }


   public void start(Stage primaryStage) 
   {
     GridPane pane = new GridPane();
     pane.setAlignment(Pos.CENTER);
     pane.sethgap(5);
     pane.setvgap(5);
     
     for(int i = 0; i < 3; i++)
      {
         for(int j = 0; j<3; j++)
         {
            int status = (int)(Math.random() *3);
            if(status == 0);
            pane.add(new 
         }
      }

     
   }

   public static void main(String[] args)
   {
     
      
   }
}