import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class Controller {
    Scene Game, startMenu;


    @FXML private Label label;
    @FXML private TextField field;
    private Execute main;

    public void setMain(Execute main){
        this.main = main;
    }
    public void handleButton(Stage primaryStage){
        primaryStage.setScene(Game);

    }

}
