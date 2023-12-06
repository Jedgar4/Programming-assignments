import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


public class TicTacToeApp extends Application
 {

    private boolean gameover = false;

    private Tile[][] board = new Tile[3][3];
    private List<Combo> combos = new ArrayList<>();
    
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
 


    private Pane root = new Pane();

    private Parent createContent() 
    {
        root.setPrefSize(600, 600);
        

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                Tile tile = new Tile();
                tile.setTranslateX(j * 200);
                tile.setTranslateY(i * 200);

                root.getChildren().add(tile);

                board[j][i] = tile;
            }
        }
        Tile box = new  Tile();
        box.setTranslateX(600);
        box.setTranslateY(200);
        root.getChildren().add(box);

 
        for (int y = 0; y < 3; y++)
        {
            combos.add(new Combo(board[0][y], board[1][y], board[2][y]));
        }


        for (int x = 0; x < 3; x++) 
        {
            combos.add(new Combo(board[x][0], board[x][1], board[x][2]));
        }


        combos.add(new Combo(board[0][0], board[1][1], board[2][2]));
        combos.add(new Combo(board[2][0], board[1][1], board[0][2]));

        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        stage.setTitle("Text Field Example");
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    private void check() 
    {
        for (Combo combo : combos)
         {
            if (combo.isComplete()) 
            {
                gameover = true;
                
                break;
            }
        }
    }

 
    private class Combo 
    {
        private Tile[] tiles;
        public Combo(Tile... tiles)
         {
            this.tiles = tiles;
        }

        public boolean isComplete()
         {
            if (tiles[0].getValue().isEmpty())
                return false;

            return tiles[0].getValue().equals(tiles[1].getValue())
                    && tiles[0].getValue().equals(tiles[2].getValue());
        }
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

            setOnMouseClicked(event ->
             {

                if (gameover)
                {
                 return;
                }
                    
                if (turnX) 
                {
                 drawX();
                 text.setFill(Color.RED); 
                 turnX = false;
                }
                 else
                {
                 drawO();
                 text.setFill(Color.BLUE);
                 turnX = true;
                }

                check();
            
               });
              }
        public double getCenterX() 
        {
            return getTranslateX() + 100;
        }

        public double getCenterY()
        {
            return getTranslateY() + 100;
        }

        public String getValue()
        {
            return text.getText();
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

    public static void main(String[] args)
    {
        launch(args);
    }
}