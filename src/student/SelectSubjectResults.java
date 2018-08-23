package student;

import dataBaseConfig.Queries;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import receptionist.VarReceptionist;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SelectSubjectResults implements Initializable {

    @FXML
    private AnchorPane paneSelectSubjectResults;

    @FXML
    private Label lblID1;

    @FXML
    private Label lblName1;

    @FXML
    private Label lblID2;

    @FXML
    private Label lblID3;

    @FXML
    private Label lblID4;

    @FXML
    private Label lblName2;

    @FXML
    private Label lblName3;

    @FXML
    private Label lblName4;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    void handleBtn1(ActionEvent event) throws IOException {
        VarReceptionist.selectedSubID=lblID1.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("viewResults.fxml"));
        paneSelectSubjectResults.getChildren().setAll(pane);
    }

    @FXML
    void handleBtn2(ActionEvent event) throws  IOException {
        VarReceptionist.selectedSubID=lblID2.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("viewResults.fxml"));
        paneSelectSubjectResults.getChildren().setAll(pane);
    }

    @FXML
    void handleBtn3(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lblID3.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("viewResults.fxml"));
        paneSelectSubjectResults.getChildren().setAll(pane);
    }

    @FXML
    void handleBtn4(ActionEvent event) throws IOException{
        VarReceptionist.selectedSubID=lblID4.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("viewResults.fxml"));
        paneSelectSubjectResults.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ArrayList subIDlist = new ArrayList();
        ArrayList subNamelist = new ArrayList();

        subIDlist = Queries.getSubjectIDSWithSem(VarReceptionist.schoolType,VarReceptionist.degreeType,VarReceptionist.year,VarReceptionist.semester);
        subNamelist = Queries.getSubjectNamesWithSem(VarReceptionist.schoolType,VarReceptionist.degreeType,VarReceptionist.year,VarReceptionist.semester);

        Label arrLblID[] = new Label[8];
        arrLblID[0]=lblID1;
        arrLblID[1]=lblID2;
        arrLblID[2]=lblID3;
        arrLblID[3]=lblID4;

        Label arrLblName[] = new Label[8];
        arrLblName[0]=lblName1;
        arrLblName[1]=lblName2;
        arrLblName[2]=lblName3;
        arrLblName[3]=lblName4;

        for(int i=0;i<subIDlist.size();i++){
            arrLblID[i].setText((String)subIDlist.get(i));
        }
        for(int i=0;i<subNamelist.size();i++){
            arrLblName[i].setText((String)subNamelist.get(i));
        }
    }

}
