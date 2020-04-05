package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

import java.awt.*;

public class CubicCurveExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CubicCurve by Coder");
        Group root = new Group();
        CubicCurve curve = new CubicCurve(20,100,300,200,100,90, 100,100);
        curve.setFill(Color.RED);
        curve.setEffect(new DropShadow());
        root.getChildren().add(curve);
        Scene scene = new Scene(root,300,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
