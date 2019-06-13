import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public void gameStart(ActionEvent event) throws IOException{
        Execute.executeButBetter();
        Parent viewParent = FXMLLoader.load(getClass().getResource("Game.fxml"));
        Scene scene2 = new Scene(viewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

}
