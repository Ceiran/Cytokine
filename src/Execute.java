import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
public class Execute extends Application{

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));
        primaryStage.setTitle("Cytokine");
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    public static void executeButBetter(){
        Game game = new Game(0);
        long initial = System.currentTimeMillis();
        while (game.runTurn()) {
            while (Math.abs(initial - System.currentTimeMillis()) < 1000) { /* Hold thread for one second. */ }
            initial = System.currentTimeMillis();
        }
        System.out.println("TERMINATE GAME"); // End condition reached, patient is dead or pathogen is destroyed.

    }
}
