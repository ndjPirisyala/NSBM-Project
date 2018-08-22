package lecturer;

import dataBaseConfig.Queries;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import receptionist.VarReceptionist;
import sample.FindTable;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
public class SearchStudentBat {

    @FXML
    private AnchorPane paneSearchStudentBat;

    @FXML
    private Label lbl_1;

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
    private Label lbl_9;

    @FXML
    private Label lbl_10;

    @FXML
    private Label lbl_10_1;

    @FXML
    private Label lbl_11;

    @FXML
    private Label lbl_11_1;

    @FXML
    private Label lbl_12;

    @FXML
    private Label lbl_12_1;

    @FXML
    private Label lbl_13;

    @FXML
    private Label lbl_13_1;

    @FXML
    private Label lbl_14;

    @FXML
    private Button handleSearch;

    @FXML
    private TextField txtSearch;


    @FXML
    void handleSearch(ActionEvent event) {
        String std_id = txtSearch.getText();
        VarReceptionist.std_id=std_id;
        if(std_id.charAt(1)=='B'){
            VarReceptionist.schoolType="School of Business";
        }
        else if(std_id.charAt(1)=='C'){
            VarReceptionist.schoolType="School of Computing";
        }
        else if(std_id.charAt(1)=='E'){
            VarReceptionist.schoolType="School of Engineering";
        }
        if(std_id.charAt(2)=='1'){
            VarReceptionist.year="1";
        }
        else if(std_id.charAt(2)=='2'){
            VarReceptionist.year="2";
        }
        else if(std_id.charAt(2)=='3'){
            VarReceptionist.year="3";
        }
        else if(std_id.charAt(2)=='4'){
            VarReceptionist.year="4";
        }

        String table = FindTable.findStdTable();

        ArrayList<String> bInfo = Queries.getBachelorInfo(std_id,table);
        ArrayList<Label> lbls = new ArrayList<>();
        lbls.add(lbl_1);
        lbls.add(lbl_2);
        lbls.add(lbl_3);
        lbls.add(lbl_4);
        lbls.add(lbl_5);
        lbls.add(lbl_6);
        lbls.add(lbl_7);
        lbls.add(lbl_9);

        for(int i=0;i<lbls.size();i++){
            lbls.get(i).setText(bInfo.get(i+1));
        }
    }

    @FXML
    void handleCancel(ActionEvent event) {

    }

}
