package receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;


public class DegreeType implements Initializable {

    private ToggleGroup group = new ToggleGroup();

    @FXML
    private AnchorPane paneDegreeType;

    @FXML
    private Button buttonNext;

    @FXML
    private RadioButton rbBachelor;

    @FXML
    private RadioButton rbMaster;

    @FXML
    void handelBachelor(ActionEvent event) {
        rbBachelor.setToggleGroup(group);
    }

    @FXML
    void handleMaster(ActionEvent event) {
        rbMaster.setToggleGroup(group);
    }

    @FXML
    void handleNext(ActionEvent event) throws IOException {
        if(rbBachelor.isSelected()){
            VarReceptionist.degreeType="Bachelor";
        }
        else if(rbMaster.isSelected()){
            VarReceptionist.degreeType="Master";
        }
        System.out.println(VarReceptionist.degreeType);

        if(Arrays.asList("registration","subject details","add results").contains(VarReceptionist.scenario)){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("schoolType.fxml"));
            paneDegreeType.getChildren().setAll(pane);
        }
        else if(VarReceptionist.degreeType.equals("Bachelor") && Arrays.asList("student details").contains(VarReceptionist.scenario)){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../lecturer/searchStudentBat.fxml"));
            paneDegreeType.getChildren().setAll(pane);
        }
        else if(VarReceptionist.degreeType.equals("Master") && Arrays.asList("student details").contains(VarReceptionist.scenario)){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../lecturer/searchStudentMas.fxml"));
            paneDegreeType.getChildren().setAll(pane);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
