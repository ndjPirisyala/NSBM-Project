package examinationDepartment;

import dataBaseConfig.Queries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import receptionist.VarReceptionist;
import sample.FindTable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewResults implements Initializable {

    @FXML
    private TableView<?> tblViewRes;

    @FXML
    private Button btnCancel;

    @FXML
    void handleCancel(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TableColumn id = new TableColumn("Student ID");
        TableColumn results = new TableColumn("Result");
        tblViewRes.getColumns().addAll(id,results);

        String table = "exam_results";
        ArrayList arrIDS = Queries.getIDs(table);
        ArrayList resArr = new ArrayList();

        for(int i=0;i<arrIDS.size();i++){
            resArr.add(Queries.getResults(table, (String) arrIDS.get(i),VarReceptionist.year,VarReceptionist.semester,VarReceptionist.degreeType,VarReceptionist.schoolType,VarReceptionist.selectedSubID));
        }

        ArrayList objArr = new ArrayList();

        for(int i=0;i<arrIDS.size();i++){
            viewClass vs = new viewClass((String)arrIDS.get(i),(String)resArr.get(i));
            objArr.add(vs);
        }

        final ObservableList<resultsClass> data = FXCollections.observableArrayList(objArr);

        id.setCellValueFactory(new PropertyValueFactory<resultsClass,String>("id"));
        results.setCellValueFactory(new PropertyValueFactory<resultsClass,String>("results"));
    }
}
