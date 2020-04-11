package org.mainapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements Initializable {


    public void ButtonGenerateFantasyNamesGenerator(ActionEvent actionEvent) {
        try {
            Parent sScene = FXMLLoader.load(getClass().getResource("/view/FantasyNamesGenerator.fxml"));
            Scene scene = new Scene(sScene, 726, 460);

            scene.getStylesheets().add(getClass().getResource("/view/FantasyNamesGenerator.css").toExternalForm());

            Stage stage = new Stage();

            stage.setMaxHeight(460);
            stage.setMaxWidth(726);
            stage.setMinHeight(460);
            stage.setMinWidth(726);


            stage.setTitle("Fantasy Names Generator");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    public void ButtonGenerateJapanesNamesGenerator(ActionEvent actionEvent) {
        try {
            Parent sScene = FXMLLoader.load(getClass().getResource("/view/JapanesNamesGenerator.fxml"));
            Scene scene = new Scene(sScene, 726, 460);

            scene.getStylesheets().add(getClass().getResource("/view/JapanesNamesGenerator.css").toExternalForm());

            Stage stage = new Stage();

            stage.setMaxHeight(460);
            stage.setMaxWidth(726);
            stage.setMinHeight(460);
            stage.setMinWidth(726);


            stage.setTitle("Japanes Names Generator");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
