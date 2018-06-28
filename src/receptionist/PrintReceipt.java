package receptionist;

import dataBaseConfig.Queries;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.ValueAxis;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import sample.FindTable;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PrintReceipt implements Initializable {

    @FXML
    private AnchorPane panePrintReceipt;

    @FXML
    private Label lblSem1;

    @FXML
    private Label lblSem1Sub1;

    @FXML
    private Label lblSem1Fee1;

    @FXML
    private Label lblSem1Sub2;

    @FXML
    private Label lblSem1Fee2;

    @FXML
    private Label lblSem1Sub3;

    @FXML
    private Label lblSem1Fee3;

    @FXML
    private Label lblSem1Sub4;

    @FXML
    private Label lblSem1Fee4;

    @FXML
    private Label lblSem2;

    @FXML
    private Label lblSem2Sub1;

    @FXML
    private Label lblSem2Fee1;

    @FXML
    private Label lblSem2Sub2;

    @FXML
    private Label lblSem2Fee2;

    @FXML
    private Label lblSem2Sub3;

    @FXML
    private Label lblSem2Fee3;

    @FXML
    private Label lblSem2Sub4;

    @FXML
    private Label lblSem2Fee4;

    @FXML
    private Button buttonEnroll;

    @FXML
    private Label lblStudentID;

    @FXML
    private Label lblSdt_id;

    @FXML
    private Label lblTotalfee;

    @FXML
    private Label lblTotal;

    @FXML
    void handleEnroll(ActionEvent event) {
        String table = FindTable.findStdTable();
        if(VarReceptionist.degreeType.equals("Bachelor")){
            Queries.insertBachelorInfo(table,VarReceptionist.std_id, VarReceptionist.name,
                    VarReceptionist.NIC, VarReceptionist.address, VarReceptionist.gender, VarReceptionist.email,
                    VarReceptionist.degreeType, VarReceptionist.schoolType, Integer.parseInt(VarReceptionist.year));

            for(int i=0;i<4;i++){
                Queries.insertBachelorALResults(VarReceptionist.std_id,VarReceptionist.subArray[i],VarReceptionist.resArray[i]);
            }
        }
        else{
            Queries.insertMasterInfo(table,VarReceptionist.std_id, VarReceptionist.name,
                    VarReceptionist.NIC, VarReceptionist.address, VarReceptionist.gender, VarReceptionist.email,
                    VarReceptionist.degreeType, VarReceptionist.schoolType, Integer.parseInt(VarReceptionist.year),
                    VarReceptionist.qualificationType, VarReceptionist.institute, Integer.parseInt(VarReceptionist.yearOfCompletion));
        }
        if(VarReceptionist.inMonth.equals("February")){
            for(int i=0;i<4;i++){
                Queries.insertSelectedSubs(VarReceptionist.std_id,VarReceptionist.subSelection[i]);
            }
        }
        else{
            for(int i=0;i<8;i++){
                Queries.insertSelectedSubs(VarReceptionist.std_id,VarReceptionist.subSelection[i]);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //set subjects
        if(VarReceptionist.inMonth.equals("February")){
            if (lblSem1Sub1 != null) {
                lblSem1Sub1.setText(VarReceptionist.subSelection[0]);
            }
            if (lblSem1Sub2 != null) {
                lblSem1Sub2.setText(VarReceptionist.subSelection[1]);
            }
            if (lblSem1Sub3 != null) {
                lblSem1Sub3.setText(VarReceptionist.subSelection[2]);
            }
            if (lblSem1Sub4 != null) {
                lblSem1Sub4.setText(VarReceptionist.subSelection[3]);
            }
        }

        if (lblSem2Sub1 != null) {
            lblSem2Sub1.setText(VarReceptionist.subSelection[4]);
        }
        if (lblSem1Sub2 != null) {
            lblSem2Sub2.setText(VarReceptionist.subSelection[5]);
        }
        if (lblSem2Sub3 != null) {
            lblSem2Sub3.setText(VarReceptionist.subSelection[6]);
        }
        if (lblSem2Sub4 != null) {
            lblSem2Sub4.setText(VarReceptionist.subSelection[7]);
        }
        //set fees
        /*ArrayList<String> feeList=new ArrayList<String>();
        feeList=Queries.getFees(VarReceptionist.schoolType,VarReceptionist.degreeType,VarReceptionist.year);
        if(VarReceptionist.inMonth.equals("February")){
            if (lblSem1Fee1 != null) {
                lblSem1Fee1.setText(feeList.get(0));
            }
            if (lblSem1Fee2 != null) {
                lblSem1Fee2.setText(feeList.get(1));
            }
            if (lblSem1Fee3 != null) {
                lblSem1Fee3.setText(feeList.get(2));
            }
            if (lblSem1Fee4 != null) {
                lblSem1Fee4.setText(feeList.get(3));
            }
        }
        if (lblSem2Fee1 != null) {
            lblSem2Fee1.setText(feeList.get(4));
        }
        if (lblSem2Fee2 != null) {
            lblSem2Fee2.setText(feeList.get(5));
        }
        if (lblSem2Fee3 != null) {
            lblSem2Fee3.setText(feeList.get(6));
        }
        if (lblSem2Fee4 != null) {
            lblSem2Fee4.setText(feeList.get(7));
        }*/
    }
}
