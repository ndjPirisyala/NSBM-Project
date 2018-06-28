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

public class BachelorYear implements Initializable {

    private ToggleGroup group = new ToggleGroup();

    @FXML
    private AnchorPane paneBachelorYear;

    @FXML
    private RadioButton rbFirstYear;

    @FXML
    private RadioButton rbSecondYear;

    @FXML
    private RadioButton rbThirdYear;

    @FXML
    private RadioButton rbFourthYear;

    @FXML
    private Button buttonNext;

    @FXML
    void handleFirstYear(ActionEvent event) {
        rbFirstYear.setToggleGroup(group);
    }

    @FXML
    void handleSecondYear(ActionEvent event) {
        rbSecondYear.setToggleGroup(group);
    }

    @FXML
    void handleThirdYear(ActionEvent event) {
        rbThirdYear.setToggleGroup(group);
    }

    @FXML
    void handleFourthYear(ActionEvent event) {
        rbFourthYear.setToggleGroup(group);
    }

    @FXML
    void handleNext(ActionEvent event) throws IOException {
       if(rbFirstYear.isSelected()){
           VarReceptionist.year="1";
       }
       else if(rbSecondYear.isSelected()){
           VarReceptionist.year="2";
       }
       else if(rbThirdYear.isSelected()){
           VarReceptionist.year="3";
       }
       else if(rbFourthYear.isSelected()){
           VarReceptionist.year="4";
       }
       System.out.println(VarReceptionist.year);

       if(VarReceptionist.scenario.equals("registration")){
           AnchorPane pane = FXMLLoader.load(getClass().getResource("stdID.fxml"));
           paneBachelorYear.getChildren().setAll(pane);
       }
    }





    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
