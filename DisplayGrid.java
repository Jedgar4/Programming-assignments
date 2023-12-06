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
         
         setAlignment(Pos.CENTER);
         getChildren().addAll(border);
         //getChildren().addAll(border, text);
         
         setOnMouseClicked(event->
         { 
            if(event.getButton() == MouseButton.PRIMARY)
            {
               drawX(); 
            }
            if(event.getButton() == MouseButton.SECONDARY)
            {
               drawO(); 
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
    /*  primaryStage.setTitle("TicTacToe");
      Button button1 = new Button("1");
      Button button2 = new Button("2");
      Button button3 = new Button("3");
      Button button4 = new Button("4");
      Button button5 = new Button("5");
      Button button6 = new Button("6");
      Button button7 = new Button("7");
      Button button8 = new Button("8");
      Button button9 = new Button("9");
      
      TilePane tilePane = new TilePane();
      tilePane.getChildren().add(button1);
      tilePane.getChildren().add(button2);
      tilePane.getChildren().add(button3);
      tilePane.getChildren().add(button4);
      tilePane.getChildren().add(button5);
      tilePane.getChildren().add(button6);
      tilePane.getChildren().add(button7);
      tilePane.getChildren().add(button8);
      tilePane.getChildren().add(button9);
      
     tilePane.setTileAlignment(Pos.CENTER);
      Scene scene = new Scene(tilePane,600, 600);
      primaryStage.setScene(scene);
      primaryStage.show();*/
       

     

      
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