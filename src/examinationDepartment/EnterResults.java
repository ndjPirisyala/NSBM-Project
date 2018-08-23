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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class EnterResults implements Initializable {

    @FXML
    private AnchorPane paneEnterResults;

    @FXML
    private TableView<resultsClass> tblView;

    @FXML
    private Button btnEnter;

    @FXML
    void handleEnter(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        TableColumn id = new TableColumn("Student ID");
        TableColumn results = new TableColumn("Result");
        tblView.getColumns().addAll(id,results);

        ArrayList arrIDS = Queries.getIDs("bachelor_business_firstyear");
        ArrayList objArr = new ArrayList();

        TextField arrTxt[] = new TextField[arrIDS.size()];

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

   /* public void handleEnter(MouseEvent mouseEvent) {
    }*/
}
