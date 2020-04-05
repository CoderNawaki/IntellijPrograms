package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class LineDrawingExample extends Application
{
    @Override//auto generated method
    public void start(Stage primaryStage) throws Exception {
        Line line1 = new Line(10,50,150,50);
        Line line2 = new Line(10,100,150,100);
        Line line3 = new Line(10,50,10,100);
        Line line4 = new Line(150,50,150,100);

        Group root = new Group();
        root.getChildren().addAll(line1,line2,line3,line4);//adding the class object to the group
        Scene scene = new Scene(root,200,200, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("LineDrawingExample");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
