package examinationDepartment;

import dataBaseConfig.Queries;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;


public class SelectSubject implements Initializable{

    @FXML
    private AnchorPane paneSelectSubject;

    @FXML
    private Label lbl_ID1;

    @FXML
    private Label lbl_name1;

    @FXML
    private Label lbl_ID2;

    @FXML
    private Label lbl_ID3;

    @FXML
    private Label lbl_ID4;

    @FXML
    private Label lbl_ID5;

    @FXML
    private Label lbl_ID6;

    @FXML
    private Label lbl_ID7;

    @FXML
    private Label lbl_ID8;

    @FXML
    private Label lbl_name2;

    @FXML
    private Label lbl_name3;

    @FXML
    private Label lbl_name4;

    @FXML
    private Label lbl_name5;

    @FXML
    private Label lbl_name6;

    @FXML
    private Label lbl_name7;

    @FXML
    private Label lbl_name8;

    @FXML
    void handlebtn1(ActionEvent event) throws IOException {
        VarReceptionist.selectedSubID=lbl_ID1.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("enterResults.fxml"));
        paneSelectSubject.getChildren().setAll(pane);
    }

    @FXML
    void handlebtn2(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_ID2.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("enterResults.fxml"));
        paneSelectSubject.getChildren().setAll(pane);
    }

    @FXML
    void handlebtn3(ActionEvent event) throws IOException {
        VarReceptionist.selectedSubID=lbl_ID3.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("enterResults.fxml"));
        paneSelectSubject.getChildren().setAll(pane);
    }

    @FXML
    void handlebtn4(ActionEvent event) throws IOException {
        VarReceptionist.selectedSubID=lbl_ID4.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("enterResults.fxml"));
        paneSelectSubject.getChildren().setAll(pane);
    }

    @FXML
    void handlebtn5(ActionEvent event) throws IOException {
        VarReceptionist.selectedSubID=lbl_ID5.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("enterResults.fxml"));
        paneSelectSubject.getChildren().setAll(pane);
    }

    @FXML
    void handlebtn6(ActionEvent event) throws IOException {
        VarReceptionist.selectedSubID=lbl_ID6.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("enterResults.fxml"));
        paneSelectSubject.getChildren().setAll(pane);
    }

    @FXML
    void handlebtn7(ActionEvent event) throws IOException {
        VarReceptionist.selectedSubID=lbl_ID7.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("enterResults.fxml"));
        paneSelectSubject.getChildren().setAll(pane);
    }

    @FXML
    void handlebtn8(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_ID8.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("enterResults.fxml"));
        paneSelectSubject.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ArrayList subIDlist = new ArrayList();
        ArrayList subNamelist = new ArrayList();

        subIDlist = Queries.getSubjectIDSWithSem(VarReceptionist.schoolType,VarReceptionist.degreeType,VarReceptionist.year,VarReceptionist.semester);
        subNamelist = Queries.getSubjectNamesWithSem(VarReceptionist.schoolType,VarReceptionist.degreeType,VarReceptionist.year,VarReceptionist.semester);

        Label arrLblID[] = new Label[8];
        arrLblID[0]=lbl_ID1;
        arrLblID[1]=lbl_ID2;
        arrLblID[2]=lbl_ID3;
        arrLblID[3]=lbl_ID4;
        arrLblID[4]=lbl_ID5;
        arrLblID[5]=lbl_ID6;
        arrLblID[6]=lbl_ID7;
        arrLblID[7]=lbl_ID8;

        Label arrLblName[] = new Label[8];
        arrLblName[0]=lbl_name1;
        arrLblName[1]=lbl_name2;
        arrLblName[2]=lbl_name3;
        arrLblName[3]=lbl_name4;
        arrLblName[4]=lbl_name5;
        arrLblName[5]=lbl_name6;
        arrLblName[6]=lbl_name7;
        arrLblName[7]=lbl_name8;

        for(int i=0;i<subIDlist.size();i++){
            arrLblID[i].setText((String)subIDlist.get(i));
        }
        for(int i=0;i<subNamelist.size();i++){
            arrLblName[i].setText((String)subNamelist.get(i));
        }
    }

}
