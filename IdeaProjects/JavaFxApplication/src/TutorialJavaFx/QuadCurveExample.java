package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

public class QuadCurveExample  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("QuadCurve Example");
        Group root = new Group();
        QuadCurve curve = new QuadCurve(70,30,250,50,250,300);
        curve.setFill(Color.PURPLE);
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
