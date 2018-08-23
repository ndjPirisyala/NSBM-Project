package examinationDepartment;

import dataBaseConfig.Queries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import receptionist.VarReceptionist;
import sample.FindTable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class EnterResults implements Initializable {
    int n;
    TextField arrTextout[]=new TextField[n];
    ArrayList arr = new ArrayList();

    @FXML
    private AnchorPane paneEnterResults;

    @FXML
    private TableView<resultsClass> tblView;

    @FXML
    private Button btnEnter;

    @FXML
    void handleEnter(ActionEvent event) {
        String table = "exam_results";
        for(int i=0;i<arr.size();i++){
            Queries.insertResults(table, (String) arr.get(i),VarReceptionist.year,VarReceptionist.semester,VarReceptionist.degreeType,VarReceptionist.schoolType,VarReceptionist.selectedSubID,arrTextout[i].getText());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        TableColumn id = new TableColumn("Student ID");
        TableColumn results = new TableColumn("Result");
        tblView.getColumns().addAll(id,results);

        String table = FindTable.findStdTable();
        ArrayList arrIDS = Queries.getIDs(table);
        arr=arrIDS;

        ArrayList objArr = new ArrayList();

        TextField arrTxt[] = new TextField[arrIDS.size()];
        n=arrTxt.length;
        arrTextout=arrTxt;

        for(int i=0;i<arrIDS.size();i++){
            resultsClass rs = new resultsClass((String)arrIDS.get(i),"");
            objArr.add(rs);
            arrTxt[i] = rs.getResults();
        }

        final ObservableList<resultsClass> data = FXCollections.observableArrayList(objArr);

        id.setCellValueFactory(new PropertyValueFactory<resultsClass,String>("id"));
        results.setCellValueFactory(new PropertyValueFactory<resultsClass,String>("results"));

        tblView.setItems(data);

    }
}
