package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleExample extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Rectangle Example");
        Group group = new Group();
        Rectangle rect = new Rectangle();
        rect.setX(20);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(100);

        group.getChildren().addAll(rect);
        Scene scene = new Scene(group,200,300, Color.GREEN);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
