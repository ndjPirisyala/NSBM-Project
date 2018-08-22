package examinationDepartment;

import dataBaseConfig.Queries;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import receptionist.VarReceptionist;
import sample.FindTable;
import java.util.List;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;
import javafx.collections.FXCollections;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class EnterResults  implements Initializable {

    @FXML
    private AnchorPane paneEnterResults;

    @FXML
    private TableView<keep> tbl1;

    @FXML
    private TableView<String> tbl2;

    @FXML
    private TableView<?> tbl3;

    @FXML
    private TableColumn<keep,String> colID1;

    @FXML

    private TableColumn<String, String> colRes1;
    class keep{
        String hold;
    }

    ObservableList<keep> data;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colID1.setCellValueFactory(new PropertyValueFactory<keep, String>("id"));
        // colRes1.setCellValueFactory(new PropertyValueFactory<String, String>("name"));
        //  Active.setCellValueFactory(new PropertyValueFactory<String, String>("active"));
        ArrayList<String> arr = Queries.getIDs("bachelor_business_firstyear");
        for(int i= 0;i<arr.size();++i){
            keep holdMe = new keep();
            holdMe.hold=arr.get(i);
            System.out.println(holdMe.hold);
            data.add(holdMe);
        }
        //data = FXCollections.observableArrayList();
        tbl1.setItems(data);
    }
}


