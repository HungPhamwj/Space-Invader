package uet.oop.spaceshootergamejavafx.entities;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UITest extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 350, 800); // Dùng WIDTH và HEIGHT từ SpaceShooter
        primaryStage.setScene(scene);
        primaryStage.setTitle("UI Test");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}