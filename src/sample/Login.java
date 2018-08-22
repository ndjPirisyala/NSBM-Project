package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import receptionist.VarReceptionist;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Login {

    @FXML
    private AnchorPane paneLogin;

    @FXML
    private TextField txtUser;

    @FXML
    private TextField txtPass;

    @FXML
    void handleLogin(ActionEvent event) throws IOException{
        VarReceptionist.userName=txtUser.getText();
        VarReceptionist.passWord=txtPass.getText();
        System.out.println(VarReceptionist.userName);
        if(VarReceptionist.userName.equals("recep") && VarReceptionist.passWord.equals("123")){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../receptionist/receptionistHome.fxml"));
            paneLogin.getChildren().setAll(pane);
        }
        else if(VarReceptionist.userName.equals("admin") && VarReceptionist.passWord.equals("123")){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../admin/adminHome.fxml"));
            paneLogin.getChildren().setAll(pane);
        }
        else if(VarReceptionist.userName.startsWith("lec") && VarReceptionist.passWord.equals("123")){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../lecturer/lecturerHome.fxml"));
            paneLogin.getChildren().setAll(pane);
        }
        else if(VarReceptionist.userName.startsWith("ins") && VarReceptionist.passWord.equals("123")){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../instructor/instructorHome.fxml"));
            paneLogin.getChildren().setAll(pane);
        }
        else if(VarReceptionist.userName.equals("examDept") && VarReceptionist.passWord.equals("123")){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../examinationDepartment/examinationDepartmentHome.fxml"));
            paneLogin.getChildren().setAll(pane);
        }
        else if((VarReceptionist.userName.startsWith("B") || VarReceptionist.userName.startsWith("M")) && VarReceptionist.passWord.equals("123")){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("../student/studentHome.fxml"));
            paneLogin.getChildren().setAll(pane);
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Oops! Something went wrong!");
            alert.setContentText("Wrong username or password!");

            alert.showAndWait();
        }
    }

}
