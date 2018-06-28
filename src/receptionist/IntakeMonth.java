package receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class IntakeMonth implements Initializable {

    private ToggleGroup group = new ToggleGroup();

    @FXML
    private AnchorPane paneIntakeMonth;

    @FXML
    private RadioButton rbFeb;

    @FXML
    private RadioButton rbJuly;

    @FXML
    private Button buttonNext;

    @FXML
    void handleFeb(ActionEvent event) {
        rbFeb.setToggleGroup(group);
    }

    @FXML
    void handleJuly(ActionEvent event) {
        rbJuly.setToggleGroup(group);
    }

    @FXML
    void handleNext(ActionEvent event) throws IOException{
        if(rbFeb.isSelected()){
            VarReceptionist.inMonth="February";
        }
        if(rbJuly.isSelected()){
            VarReceptionist.inMonth="July";
        }
        System.out.println(VarReceptionist.inMonth);

        if(VarReceptionist.scenario.equals("registration")){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("degreeType.fxml"));
            paneIntakeMonth.getChildren().setAll(pane);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
