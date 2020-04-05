package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GradientColorExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start( final Stage primaryStage) throws Exception {
        primaryStage.setTitle("Gradient Color");
        Group root = new Group();
        Scene scene = new Scene(root,400,300,Color.GRAY);

        primaryStage.setScene(scene);
        primaryStage.show();
        addRectangle(scene);
    }
    private void addRectangle(final Scene scene){
        Circle circle = new Circle(200,150,100);
        RadialGradient gradient = new RadialGradient(0,.1,100,100,200,false,CycleMethod.NO_CYCLE,
                new Stop(0,Color.YELLOW),
                new Stop(1,Color.RED));
        circle.setFill(gradient);

        Group root = new Group(scene.getRoot());
        root.getChildren().add(circle);
    }

}
