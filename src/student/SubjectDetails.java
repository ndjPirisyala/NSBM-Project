package student;

import dataBaseConfig.Queries;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class SubjectDetails implements Initializable{

    Label arrOne[] = new Label[8];
    Label arrTwo[] = new Label[8];

    @FXML
    private AnchorPane paneSubDetails;

    @FXML
    private Label lbl_1;

    @FXML
    private Label lbl_12;

    @FXML
    private Label lbl_2;

    @FXML
    private Label lbl_3;

    @FXML
    private Label lbl_4;

    @FXML
    private Label lbl_5;

    @FXML
    private Label lbl_6;

    @FXML
    private Label lbl_7;

    @FXML
    private Label lbl_8;

    @FXML
    private Label lbl_22;

    @FXML
    private Label lbl_32;

    @FXML
    private Label lbl_42;

    @FXML
    private Label lbl_52;

    @FXML
    private Label lbl_62;

    @FXML
    private Label lbl_72;

    @FXML
    private Label lbl_82;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button byn_8;

    @FXML
    private Button lblCancel;

    @FXML
    void handle_btn1(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_1.getText();
        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectLecsIns.fxml"));
            paneSubDetails.getChildren().setAll(pane);
        }
    }

    @FXML
    void handle_btn2(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_2.getText();
        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectLecsIns.fxml"));
            paneSubDetails.getChildren().setAll(pane);
        }
    }

    @FXML
    void handle_btn3(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_3.getText();
        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectLecsIns.fxml"));
            paneSubDetails.getChildren().setAll(pane);
        }
    }

    @FXML
    void handle_btn4(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_4.getText();
        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectLecsIns.fxml"));
            paneSubDetails.getChildren().setAll(pane);
        }
    }

    @FXML
    void handle_btn5(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_5.getText();
        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectLecsIns.fxml"));
            paneSubDetails.getChildren().setAll(pane);
        }
    }

    @FXML
    void handle_btn6(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_6.getText();
        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectLecsIns.fxml"));
            paneSubDetails.getChildren().setAll(pane);
        }
    }

    @FXML
    void handle_btn7(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_7.getText();
        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectLecsIns.fxml"));
            paneSubDetails.getChildren().setAll(pane);
        }
    }

    @FXML
    void handle_btn8(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lbl_8.getText();
        if(Arrays.asList("subject details").contains(VarReceptionist.scenario)){
            System.out.println(VarReceptionist.semester);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("subjectLecsIns.fxml"));
            paneSubDetails.getChildren().setAll(pane);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ArrayList<String> listID=new ArrayList<String>();
        ArrayList<String> listNames=new ArrayList<String>();
        listID=Queries.getSubjectIDS(VarReceptionist.schoolType,VarReceptionist.degreeType,String.valueOf(VarReceptionist.year));
        listNames=Queries.getSubjectNames(VarReceptionist.schoolType,VarReceptionist.degreeType,String.valueOf(VarReceptionist.year));

        arrOne[0]=lbl_1;
        arrOne[1]=lbl_2;
        arrOne[2]=lbl_3;
        arrOne[3]=lbl_4;
        arrOne[4]=lbl_5;
        arrOne[5]=lbl_6;
        arrOne[6]=lbl_7;
        arrOne[7]=lbl_8;

        arrTwo[0]=lbl_12;
        arrTwo[1]=lbl_22;
        arrTwo[2]=lbl_32;
        arrTwo[3]=lbl_42;
        arrTwo[4]=lbl_52;
        arrTwo[5]=lbl_62;
        arrTwo[6]=lbl_72;
        arrTwo[7]=lbl_82;

        for(int i=0;i<listID.size();i++){
            arrOne[i].setText(listID.get(i));
        }
        for(int i=0;i<listNames.size();i++){
            arrTwo[i].setText(listNames.get(i));
        }
    }

}
