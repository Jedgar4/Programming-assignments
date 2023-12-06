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
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.scene.input.MouseButton;

public class DisplayGrid extends Application
{
     
      public boolean turn()  
      {   
         int rand = (int)(Math.random()*2);     
         if(rand == 0)
         {
           return true;
         }
         return false;
      }
      private boolean turnX = turn();
 
   private Parent createContent()
   {
      Pane root = new Pane();
      root.setPrefSize(600, 600);
      
       for(int i = 0; i < 3; i++)
      {
         for(int j = 0; j<3; j++)
         {
            Tile tile = new Tile();
            tile.setTranslateX(j * 200);
            tile.setTranslateY(i * 200);
            root.getChildren().add(tile);
         }
      }
      
      return root;
   }
   private class Tile extends StackPane
   {
      private Text text = new Text();
      
      public Tile()
      {
         Rectangle border = new Rectangle(200, 200);
         border.setFill(Color.BLACK);
         border.setStroke(Color.WHITE);
         
         text.setFont(Font.font(72));
         
         setAlignment(Pos.CENTER);
         getChildren().addAll(border, text);
       
         setOnMouseClicked(event->
         { 
            if(event.getButton() == MouseButton.PRIMARY)
            {

               if(!turnX)
               {
                  return;
               }
               drawX();
               text.setFill(Color.RED); 
                 
               turnX = false;
            }
            if(event.getButton() == MouseButton.SECONDARY)
            {
               if(turnX)
               {
                  return;
               }
               drawO();
               text.setFill(Color.BLUE); 
               turnX = true;           
            }
         });      
      }
     
      private void drawX()
      {
         text.setText("X");
      }
      private void drawO()
      {
         text.setText("O");
      }
   } 
   public void start(Stage primaryStage) throws Exception
   {
      
     primaryStage.setResizable(false);
      primaryStage.setMinWidth(600);
      primaryStage.setMaxWidth(600);
      primaryStage.setMinHeight(600);
      primaryStage.setMaxHeight(600);
      primaryStage.setScene(new Scene(createContent()));
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      Application.launch(args); 
      
   }
}