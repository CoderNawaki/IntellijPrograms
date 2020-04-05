package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;



public class PolygonExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Polygon Example");
        Group root = new Group();
      Polygon polygon = new Polygon();
        polygon.getPoints().addAll(0.0,0.0,
                100.0,200.0,
                200.0,100.0);
        root.getChildren().add(polygon);
        Scene scene = new Scene(root,250,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
      launch(args);
    }
}
