package student;

import dataBaseConfig.Queries;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import receptionist.VarReceptionist;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ChangeMySubjects implements Initializable {

    @FXML
    private ComboBox<String> cb1;

    @FXML
    private ComboBox<String> cb2;

    @FXML
    private ComboBox<String> cb3;

    @FXML
    private ComboBox<String> cb4;

    @FXML
    void handleChange(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("jkbsdifbdiv");
        String std_id=VarReceptionist.userName;
        System.out.println(std_id);
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

        ArrayList listNames=Queries.getSubjectNames(VarReceptionist.schoolType,VarReceptionist.degreeType,String.valueOf(VarReceptionist.year));
        for(int i=0;i<listNames.size();++i){
            String item=((String)listNames.get(i));
            cb1.getItems().addAll(item);
            cb2.getItems().addAll(item);
            cb3.getItems().addAll(item);
            cb4.getItems().addAll(item);
        }
    }

}
