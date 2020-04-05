package TutorialJavaFx;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RotateTransitionExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle rect = new Rectangle(200,100,200,200);
        rect.setFill(Color.BROWN);
        rect.setStroke(Color.HOTPINK);
        rect.setStrokeWidth(5);

        RotateTransition rotate = new RotateTransition();

        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);//angle of rotation
        rotate.setCycleCount(400);
        rotate.setDuration(Duration.millis(1000));
        rotate.setAutoReverse(true);
        //setting the Rectangle as the node onto which the transition applied
        rotate.setNode(rect);
        rotate.play();
        //group and scene
        Group group= new Group();
        group.getChildren().add(rect);

        Scene scene = new Scene(group,600,400,Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rotate Transition Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
