package receptionist;

import dataBaseConfig.Queries;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ApplicationSelectSubjects implements Initializable{

    @FXML
    private AnchorPane paneSelectSubjects;

    @FXML
    private ComboBox<String> cbSem1Sub1;

    @FXML
    private ComboBox<String> cbSem1Sub2;

    @FXML
    private ComboBox<String> cbSem1Sub3;

    @FXML
    private ComboBox<String> cbSem1Sub4;

    @FXML
    private ComboBox<String> cbSem2Sub1;

    @FXML
    private ComboBox<String> cbSem2Sub2;

    @FXML
    private ComboBox<String> cbSem2Sub3;

    @FXML
    private ComboBox<String> cbSem2Sub4;

    @FXML
    private Button buttonPrintReceipt;

    @FXML
    void handleSem1Sub1(ActionEvent event) {

    }

    @FXML
    void handleSem1Sub2(ActionEvent event) {

    }

    @FXML
    void handleSem1Sub3(ActionEvent event) {

    }

    @FXML
    void handleSem1Sub4(ActionEvent event) {

    }

    @FXML
    void handleSem2Sub1(ActionEvent event) {

    }

    @FXML
    void handleSem2Sub2(ActionEvent event) {

    }

    @FXML
    void handleSem2Sub3(ActionEvent event) {

    }

    @FXML
    void handleSem2Sub4(ActionEvent event) {

    }

    @FXML
    void handlePrintReceipt(ActionEvent event) throws IOException {
        VarReceptionist.subSelection[0]=cbSem1Sub1.getValue();
        VarReceptionist.subSelection[1]=cbSem1Sub2.getValue();
        VarReceptionist.subSelection[2]=cbSem1Sub3.getValue();
        VarReceptionist.subSelection[3]=cbSem1Sub4.getValue();
        VarReceptionist.subSelection[4]=cbSem2Sub1.getValue();
        VarReceptionist.subSelection[5]=cbSem2Sub2.getValue();
        VarReceptionist.subSelection[6]=cbSem2Sub3.getValue();
        VarReceptionist.subSelection[7]=cbSem2Sub4.getValue();

        for(int i=0;i<8;i++){
            System.out.println(VarReceptionist.subSelection[i]);
        }

        AnchorPane pane = FXMLLoader.load(getClass().getResource("printReceipt.fxml"));
        paneSelectSubjects.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ArrayList<String> listID=new ArrayList<String>();
        ArrayList<String> listNames=new ArrayList<String>();
        listID=Queries.getSubjectIDS(VarReceptionist.schoolType,VarReceptionist.degreeType,String.valueOf(VarReceptionist.year));
        listNames=Queries.getSubjectNames(VarReceptionist.schoolType,VarReceptionist.degreeType,String.valueOf(VarReceptionist.year));
        for(int i=0;i<listID.size();++i){
            String item=(listID.get(i)+" "+listNames.get(i));
            cbSem1Sub1.getItems().addAll(item);
            cbSem1Sub2.getItems().addAll(item);
            cbSem1Sub3.getItems().addAll(item);
            cbSem1Sub4.getItems().addAll(item);
            cbSem2Sub1.getItems().addAll(item);
            cbSem2Sub2.getItems().addAll(item);
            cbSem2Sub3.getItems().addAll(item);
            cbSem2Sub4.getItems().addAll(item);
        }
    }
}
