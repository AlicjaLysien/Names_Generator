package org.FantasyNamesGenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.database.DatabaseConnector;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label NewName01;

    @FXML
    private Label NewName02;

    @FXML
    private Label NewName03;

    private static List<String> syllabefirstArrayList;
    private static List<String> syllabesecondArrayList;
    private static List<String> syllabelastArrayList;

    public static List<String> getSyllabefirstArrayList() {
        return syllabefirstArrayList;
    }

    public static List<String> getSyllabesecondArrayList() {
        return syllabesecondArrayList;
    }

    public static List<String> getSyllabelastArrayList() {
        return syllabelastArrayList;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DatabaseConnector databaseConnector = new DatabaseConnector();

        this.syllabefirstArrayList = databaseConnector.syllabefirstArrayList("jdbc:postgresql://192.168.0.10:5432/names_generator", "alicja", "alicja");
        this.syllabesecondArrayList = databaseConnector.syllabesecondArrayList("jdbc:postgresql://192.168.0.10:5432/names_generator", "alicja", "alicja");
        this.syllabelastArrayList = databaseConnector.syllabelastArrayList("jdbc:postgresql://192.168.0.10:5432/names_generator", "alicja", "alicja");
    }

    public void GenerateAction(ActionEvent actionEvent) {
        NewName01.setText(CreateNames.namesGenerator());
        NewName02.setText(CreateNames.namesGenerator());
        NewName03.setText(CreateNames.namesGenerator());
    }
}
