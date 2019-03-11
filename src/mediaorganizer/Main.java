package mediaorganizer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mediaorganizer.Controller.MediaOrganizerController;


public class Main extends Application {

    MediaOrganizerController controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mediaorganizer.fxml"));
        Parent root = loader.load();
        controller = loader.getController();
        primaryStage.setTitle("CMedia");
        primaryStage.setScene(new Scene(root, 1080, 600));
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }

}