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

public class ApplicationCommon implements Initializable{

    private ToggleGroup group = new ToggleGroup();

    @FXML
    private AnchorPane paneApplicationCommon;

    @FXML
    private Button buttonNext;

    @FXML
    private TextField txtSdtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNIC;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtTP;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtDegree;

    @FXML
    private TextField txtSchool;

    @FXML
    private TextField txtYear;

    @FXML
    private RadioButton rbMale;

    @FXML
    private RadioButton rbFemale;

    @FXML
    private RadioButton rbOther;

    @FXML
    void handleFemale(ActionEvent event) {
        rbFemale.setToggleGroup(group);
    }

    @FXML
    void handleMale(ActionEvent event) {
        rbMale.setToggleGroup(group);
    }

    @FXML
    void handleOther(ActionEvent event) {
        rbOther.setToggleGroup(group);
    }

    @FXML
    void handleNext(ActionEvent event) throws IOException {
        if(rbMale.isSelected()){
            VarReceptionist.gender="Male";
        }
        if(rbFemale.isSelected()){
            VarReceptionist.gender="Female";
        }
        if(rbOther.isSelected()){
            VarReceptionist.gender="Other";
        }
        VarReceptionist.name=txtName.getText();
        VarReceptionist.NIC=txtNIC.getText();
        VarReceptionist.address=txtAddress.getText();
        VarReceptionist.TP=txtTP.getText();
        VarReceptionist.email=txtEmail.getText();

        if(VarReceptionist.degreeType.equals("Bachelor")){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("applicationBachelorSpecial.fxml"));
            paneApplicationCommon.getChildren().setAll(pane);
        }
        else{
            AnchorPane pane = FXMLLoader.load(getClass().getResource("applicationMasterSpecial.fxml"));
            paneApplicationCommon.getChildren().setAll(pane);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        if(txtSdtID != null){
            txtSdtID.setText(VarReceptionist.std_id);
        }
        if (txtDegree != null) {
            txtDegree.setText(VarReceptionist.degreeType);
        }
        if (txtSchool != null) {
            txtSchool.setText(VarReceptionist.schoolType);
        }
        if (txtSdtID != null) {
            txtSdtID.setText(VarReceptionist.std_id);
        }
        if (txtYear != null) {
            txtYear.setText(VarReceptionist.year);
        }
    }
}
