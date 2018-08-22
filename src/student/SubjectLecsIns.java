package student;

import dataBaseConfig.Queries;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import receptionist.VarReceptionist;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SubjectLecsIns implements Initializable{

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
    private Label lbl_fee;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String> lecArr=new ArrayList<>();
        ArrayList<String> inArr=new ArrayList<>();

        Label lecLabels[] = new Label[4];
        Label insLabels[] = new Label[4];

        lecLabels[0]=lbl_1;
        lecLabels[1]=lbl_2;
        lecLabels[2]=lbl_3;
        lecLabels[3]=lbl_4;
        insLabels[0]=lbl_5;
        insLabels[1]=lbl_6;
        insLabels[2]=lbl_7;
        insLabels[3]=lbl_8;

        lecArr = Queries.getSubjectLecturers(VarReceptionist.selectedSubID);
        inArr = Queries.getSubjectInstructors(VarReceptionist.selectedSubID);
        for(int i=0;i<lecArr.size();i++){
            lecLabels[i].setText(lecArr.get(i));
        }
        for(int i=0;i<inArr.size();i++){
            insLabels[i].setText(inArr.get(i));
        }

        int fee = Queries.getFee();
        lbl_fee.setText(Integer.toString(fee));
    }
}