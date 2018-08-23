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

public class MasterYear implements Initializable{

    private ToggleGroup group = new ToggleGroup();

    @FXML
    private AnchorPane paneMasterYear;

    @FXML
    private RadioButton rbFirstYear;

    @FXML
    private RadioButton rbSecondYear;

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
    void handleNext(ActionEvent event) throws IOException {
        if(rbFirstYear.isSelected()){
            VarReceptionist.year="1";
        }
        else if(rbSecondYear.isSelected()){
            VarReceptionist.year="2";
        }

        if(Arrays.asList("registration").contains(VarReceptionist.scenario)){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("stdID.fxml"));
            paneMasterYear.getChildren().setAll(pane);
        }
        else if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../student/subjectDetails.fxml"));
            paneMasterYear.getChildren().setAll(pane);
        }
        else if(Arrays.asList("add results","view results").contains(VarReceptionist.scenario)){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../student/selectSemester.fxml"));
            paneMasterYear.getChildren().setAll(pane);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
