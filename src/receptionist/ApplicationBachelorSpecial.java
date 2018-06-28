package receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationBachelorSpecial implements Initializable {

    @FXML
    private AnchorPane paneBachelorSpecial;

    @FXML
    private TextField txtSub1;

    @FXML
    private TextField txtRes1;

    @FXML
    private TextField txtSub2;

    @FXML
    private TextField txtRes3;

    @FXML
    private TextField txtSub3;

    @FXML
    private TextField txtRes2;

    @FXML
    private TextField txtSub4;

    @FXML
    private TextField txtRes4;

    @FXML
    private Button buttonNext;

    @FXML
    private TextField txtRank;

    @FXML
    void handleNext(ActionEvent event) throws IOException {
        VarReceptionist.subArray[0]=txtSub1.getText();
        VarReceptionist.resArray[0]=txtRes1.getText();
        VarReceptionist.subArray[1]=txtSub2.getText();
        VarReceptionist.resArray[1]=txtRes2.getText();
        VarReceptionist.subArray[2]=txtSub3.getText();
        VarReceptionist.resArray[2]=txtRes3.getText();
        VarReceptionist.subArray[3]=txtSub4.getText();
        VarReceptionist.resArray[3]=txtRes4.getText();
        VarReceptionist.rank=txtRank.getText();

        AnchorPane pane = FXMLLoader.load(getClass().getResource("applicationSelectSubjects.fxml"));
        paneBachelorSpecial.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
