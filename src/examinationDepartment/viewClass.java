package examinationDepartment;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class viewClass {
    private SimpleStringProperty id;
    private SimpleStringProperty results;

    viewClass(String id, String results){
        this.id = new SimpleStringProperty(id);
        this.results = new SimpleStringProperty(results);
    }

    public String getId(){
        return id.get();
    }

    public void setId(String id){
        this.id.set(id);
    }

    public final StringProperty idProperty() {
        return id;
    }

    public String getResults(){
        return results.get();
    }

    public void setResults(String results){
        this.id.set(results);
    }

    public final StringProperty resultsProperty() {
        return results;
    }
}