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



public class StudentHome implements Initializable {

    @FXML
    private AnchorPane paneStudentHome;

    @FXML
    private Button btnSearchLecs;

    @FXML
    private Button btnSearchIns;

    @FXML
    private Button btnViewResults;

    @FXML
    private Button btnSubjectDetails;

    @FXML
    private Button btnChnageSubs;


    @FXML
    void handleChangeSubs(ActionEvent event) throws IOException {
        VarReceptionist.scenario="Change subs";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("changeMySubjectsfxml"));
        paneStudentHome.getChildren().setAll(pane);
    }

    @FXML
    void handleSearchIns(ActionEvent event) throws IOException {
        VarReceptionist.scenario="Change subs";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("changeMySubjectsfxml"));
        paneStudentHome.getChildren().setAll(pane);
    }

    @FXML
    void handleSearchLecs(ActionEvent event) throws IOException {
        VarReceptionist.scenario="Change subs";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("changeMySubjectsfxml"));
        paneStudentHome.getChildren().setAll(pane);
    }

    @FXML
    void handleSubjectDetails(ActionEvent event) throws IOException {
        VarReceptionist.scenario="Change subs";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("changeMySubjectsfxml"));
        paneStudentHome.getChildren().setAll(pane);
    }

    @FXML
    void handleViewResults(ActionEvent event) throws IOException {
        VarReceptionist.scenario="Change subs";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("changeMySubjectsfxml"));
        paneStudentHome.getChildren().setAll(pane);
    }

    @Override // and this
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
