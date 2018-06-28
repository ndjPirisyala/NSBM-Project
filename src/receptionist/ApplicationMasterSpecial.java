package receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationMasterSpecial implements Initializable{

    @FXML
    private AnchorPane paneMasterSpecial;

    @FXML
    private TextField txtQualificationType;

    @FXML
    private TextField txtInstitute;

    @FXML
    private TextField txtYearOfCompletion;

    @FXML
    private Button buttonNext;

    @FXML
    void handleNext(ActionEvent event) throws IOException {
        VarReceptionist.qualificationType=txtQualificationType.getText();
        VarReceptionist.institute=txtInstitute.getText();
        VarReceptionist.yearOfCompletion=txtYearOfCompletion.getText();

        AnchorPane pane = FXMLLoader.load(getClass().getResource("applicationSelectSubjects.fxml"));
        paneMasterSpecial.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
