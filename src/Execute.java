import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class Execute extends Application {
    public static void main(String[] args) {
        Application.launch("ControllerMenu");
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        primaryStage.setTitle("Cytokine");
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();
    }
}
