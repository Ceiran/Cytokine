import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;

public class Controller {
    @FXML
    private Label health;
    public void gameStart(ActionEvent event) throws IOException{
        Execute.initialize();
        Parent target = FXMLLoader.load(getClass().getResource("Game.fxml"));
        Scene scene2 = new Scene(target,800, 600);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
   @FXML public void health(){
        health.setText("fuck");
    }

}
