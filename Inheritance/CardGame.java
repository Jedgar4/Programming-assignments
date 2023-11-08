import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;

public class CardGame extends Application
{
   //must override start method
   @Override
   public void start(Stage s)
   {
      BorderPane pane = new BorderPane();
      pane.setTop( new Button("Ok") );
      Scene scene = new Scene(pane, 300, 300, Color.rgb(176, 26, 169));
      s.setScene( scene );
      s.show();
   }
   
}