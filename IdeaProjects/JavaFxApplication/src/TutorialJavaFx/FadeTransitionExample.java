package TutorialJavaFx;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle cir = new Circle(250,120,80);
        cir.setFill(Color.YELLOW);
        cir.setStroke(Color.RED);

        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(5000));
        fade.setFromValue(10);
        fade.setToValue(0.1);
        fade.setCycleCount(1000);
        fade.setAutoReverse(true);
        fade.setNode(cir);
        fade.play();
        Group root = new Group();
        root.getChildren().add(cir);

        Scene scene = new Scene(root,500,250,Color.WHITESMOKE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Translate Transition Example");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
