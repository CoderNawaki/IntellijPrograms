package TutorialJavaFx;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class TranslateTransitionExample  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle cir = new Circle(50,100,50);
        cir.setFill(Color.PURPLE);
        cir.setStroke(Color.YELLOW);

        TranslateTransition translate = new TranslateTransition();
        translate.setByX(400);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(500);
        translate.setAutoReverse(true);
        translate.setNode(cir);
        translate.play();

        Group root = new Group();
        root.getChildren().add(cir);
        Scene scene = new Scene(root,500,200,Color.WHEAT);
        primaryStage.setTitle("Translate Transition Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
