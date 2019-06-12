import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class Execute extends Application{
    Scene Game, startMenu;
    public static void main(String[] args) {
        Game game = new Game(0);
        long initial = System.currentTimeMillis();
        while (game.runTurn()) {
            while (Math.abs(initial - System.currentTimeMillis()) < 1000) { /* Hold thread for one second. */ }
            initial = System.currentTimeMillis();
        }
        System.out.println("TERMINATE GAME"); // End condition reached, patient is dead or pathogen is destroyed.
    }
    public void start(Stage primaryStage) throws Exception {
        Button button1 = new Button("Go to scene two");
        button1.setOnAction(e -> primaryStage.setScene(Game));
    }
}
