package examinationDepartment;

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
import receptionist.VarReceptionist;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;


public class ExaminationDepartmentHome {

    @FXML
    private AnchorPane paneReceptionistHome;


    @FXML
    void handleAddResults(ActionEvent event) throws IOException{
        VarReceptionist.scenario="add results";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../receptionist/degreeType.fxml"));
        paneReceptionistHome.getChildren().setAll(pane);
    }

    @FXML
    void handleViewResults(ActionEvent event) throws IOException{
        VarReceptionist.scenario="view results";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../receptionist/degreeType.fxml"));
        paneReceptionistHome.getChildren().setAll(pane);
    }

}
