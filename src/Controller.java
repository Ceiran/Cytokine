import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
public class Controller {



    @FXML private Label label;
    @FXML private TextField field;
    private Execute main;

    public void setMain(Execute main){
        this.main = main;
    }

    public void handleButton(){
        String text = field.getText();
        label.setText(text);
    }
}
