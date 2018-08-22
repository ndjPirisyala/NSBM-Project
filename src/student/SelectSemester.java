package student;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import receptionist.VarReceptionist;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class SelectSemester {
    @FXML
    private AnchorPane paneSemester;

    @FXML
    private RadioButton rbFirstSem;

    @FXML
    private RadioButton rbSecondSem;

    @FXML
    void handleFirstSem(ActionEvent event) {

    }

    @FXML
    void handleNext(ActionEvent event) throws IOException{
        if(rbFirstSem.isSelected()){
            VarReceptionist.semester="1";
        }
        else if(rbSecondSem.isSelected()){
            VarReceptionist.semester="2";
        }

        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectDetails.fxml"));
            paneSemester.getChildren().setAll(pane);
        }
        else if(Arrays.asList("add results").contains(VarReceptionist.scenario)){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../examinationDepartment/selectSubject.fxml"));
            paneSemester.getChildren().setAll(pane);
        }
    }

    @FXML
    void handleSecondSem(ActionEvent event) {

    }

}
