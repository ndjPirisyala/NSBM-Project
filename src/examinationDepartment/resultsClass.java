package examinationDepartment;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TextField;


public class resultsClass {
    private SimpleStringProperty id;
    private TextField results;

    resultsClass(String id, String results){
        this.id = new SimpleStringProperty(id);
        this.results = new TextField(results);
    }

    public String getID(){
        return id.get();
    }

    public void setId(String id){
        this.id.set(id);
    }

    public final StringProperty idProperty() {
        return id;
    }

    public void setResults(TextField results){
        this.results=results;
    }

    public TextField getResults(){
        return results;
    }



}
