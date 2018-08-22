package admin;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
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

public class AdminHome {

    @FXML
    private AnchorPane paneAdminHome;

    @FXML
    void handleAllocate(ActionEvent event) throws IOException {
        VarReceptionist.scenario="AllocateLecsIns";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("allocateLecsIns.fxml"));
        paneAdminHome.getChildren().setAll(pane);
    }

    @FXML
    void handleEmail(ActionEvent event) throws IOException{
        VarReceptionist.scenario="HandleEmails";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("emailReport.fxml"));
        paneAdminHome.getChildren().setAll(pane);
    }

    @FXML
    void handleInstructors(ActionEvent event) throws IOException {
        VarReceptionist.scenario="HandleInstructors";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("adminHomeInstructor.fxml"));
        paneAdminHome.getChildren().setAll(pane);
    }

    @FXML
    void handleLecturers(ActionEvent event) throws IOException {
        VarReceptionist.scenario="HandleLecturers";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("adminHomeLecturer.fxml"));
        paneAdminHome.getChildren().setAll(pane);
    }

    @FXML
    void handleStudents(ActionEvent event) throws IOException {
        VarReceptionist.scenario="HandleStudents";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("adminHomeStudent.fxml"));
        paneAdminHome.getChildren().setAll(pane);
    }

    @FXML
    void handleViewResults(ActionEvent event) throws IOException{
        VarReceptionist.scenario="ViewResults";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../receptionist/degreeType.fxml"));
        paneAdminHome.getChildren().setAll(pane);
    }

    @FXML
    void handleSubjects(ActionEvent event) throws IOException{
        VarReceptionist.scenario="HandleSubjects";
        AnchorPane pane = FXMLLoader.load(getClass().getResource("adminHomeSubject.fxml"));
        paneAdminHome.getChildren().setAll(pane);
    }

}
