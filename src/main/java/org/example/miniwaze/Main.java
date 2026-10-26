package org.example.miniwaze;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.miniwaze.util.JpaUtil;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // 🔥 INIT JPA → MIGRATION DB
        JpaUtil.getEntityManager().close();

        FXMLLoader fxmlLoader =
                new FXMLLoader(Main.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("MiniWaze");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        JpaUtil.close(); // fermeture propre
    }

    public static void main(String[] args) {
        launch();
    }
}
