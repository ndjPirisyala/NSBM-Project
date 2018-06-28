package receptionist;

import dataBaseConfig.Queries;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.FindTable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StdID implements Initializable {
    @FXML
    private AnchorPane paneCreateStudentID;

    @FXML
    private Button buttonCreate;

    @FXML
    private Button buttonNext;

    @FXML
    private Label lblCreateID;

    @FXML
    void handleCreate(ActionEvent event) {
        String table=FindTable.findStdTable();
        String next=Integer.toString((Queries.countStudents(table)+1));
        //getting the type of school
        String school;
        if(VarReceptionist.schoolType.equals("School of Business")){
            school="B";
        }
        else if(VarReceptionist.schoolType.equals("School of Computing")){
            school="C";
        }
        else{
            school="E";
        }
        //getting the type of degree
        String degree;
        if(VarReceptionist.degreeType.equals("Bachelor")){
            degree="B";
        }
        else{
            degree="M";
        }
        String nextID=degree+school+VarReceptionist.year+next;
        lblCreateID.setText(nextID);
        VarReceptionist.std_id=nextID;



        //Queries.getSubject(VarReceptionist.schoolType, VarReceptionist.degreeType, VarReceptionist.year);
    }

    @FXML
    void handleNext(ActionEvent event) throws IOException {
        VarReceptionist.std_id=lblCreateID.getText();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("applicationCommon.fxml"));
        paneCreateStudentID.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
