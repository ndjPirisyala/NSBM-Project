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
import java.util.Arrays;
import java.util.ResourceBundle;

public class SchoolType implements Initializable {

    private ToggleGroup group = new ToggleGroup();

    @FXML
    private AnchorPane paneSchoolType;

    @FXML
    private Button buttonNext;

    @FXML
    private RadioButton rbBusiness;

    @FXML
    private RadioButton rbComputing;

    @FXML
    private RadioButton rbEngineering;

    @FXML
    void handleBusiness(ActionEvent event) {
        rbBusiness.setToggleGroup(group);
    }

    @FXML
    void handleComputing(ActionEvent event) {
        rbComputing.setToggleGroup(group);
    }

    @FXML
    void handleEngineering(ActionEvent event) {
        rbEngineering.setToggleGroup(group);
    }

    @FXML
    void handleNext(ActionEvent event) throws IOException {
        if(rbBusiness.isSelected()){
            VarReceptionist.schoolType="School of Business";
        }
        else if(rbComputing.isSelected()){
            VarReceptionist.schoolType="School of Computing";
        }
        else if(rbEngineering.isSelected()){
            VarReceptionist.schoolType="School of Engineering";
        }
        System.out.println(VarReceptionist.schoolType);
        if(Arrays.asList("registration","subject details","add results").contains(VarReceptionist.scenario)){
            if (VarReceptionist.degreeType.equals("Bachelor")){
                AnchorPane pane = FXMLLoader.load(getClass().getResource("bachelorYear.fxml"));
                paneSchoolType.getChildren().setAll(pane);
            }
            else{
                AnchorPane pane = FXMLLoader.load(getClass().getResource("masterYear.fxml"));
                paneSchoolType.getChildren().setAll(pane);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
