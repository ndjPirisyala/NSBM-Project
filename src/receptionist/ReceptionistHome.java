package receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.ValueAxis;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReceptionistHome implements Initializable {

    @FXML
    private AnchorPane paneReceptionistHome;

    @FXML
    private Button buttonSearchLecturers;

    @FXML
    private Button buttonSearchInstructors;

    @FXML
    private Button buttonSearchStudents;

    @FXML
    private Button buttonSubjectDetails;

    @FXML
    private Button buttonNewEnrollment;

    @FXML
    void handleNewEnrollment(ActionEvent event) throws IOException {
        VarReceptionist.scenario="registration";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("IntakeMonth.fxml"));
        paneReceptionistHome.getChildren().setAll(pane);
    }

    @FXML
    void handleSearchInstructors(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../lecturer/searchInstructor.fxml"));
        paneReceptionistHome.getChildren().setAll(pane);
    }

    @FXML
    void handleSearchLecturers(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../lecturer/searchLecturer.fxml"));
        paneReceptionistHome.getChildren().setAll(pane);
    }

    @FXML
    void handleSearchStudents(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("degreeType.fxml"));
        paneReceptionistHome.getChildren().setAll(pane);
        VarReceptionist.scenario="student details";
    }

    @FXML
    void handleSubjectDetails(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("degreeType.fxml"));
        paneReceptionistHome.getChildren().setAll(pane);
        VarReceptionist.scenario="subject details";
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
