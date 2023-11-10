import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.BorderPane;

public class Calculator extends Application
{
   private BorderPane pane = new BorderPane();
   private Scene scene = new Scene(pane);

   //need to Override start(Stage) method
   @Override
   public void start(Stage s)    //take as main method
   {
      s.setScene(scene);
      s.show();
   }
}