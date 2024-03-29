package TutorialJavaFx;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
public class TranslationExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //creating the rectangles with the same coordinates
        Rectangle rect1 = new Rectangle(20,20,200,150);
        Rectangle rect2 = new Rectangle(20,20,200,150);
        //setting the properties
        rect1.setFill(Color.YELLOW);
        rect1.setStroke(Color.BLUE);
        rect1.setStrokeWidth(5);
        rect2.setFill(Color.GREEN);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(5);
        //Instantiating the Translate class
        Translate translate = new Translate();
        //setting the properties of the translate object
        translate.setX(200);
        translate.setY(200);
        translate.setZ(200);
        //applying transformation to the second rectangle
        rect2.getTransforms().addAll(translate);
        Group group = new Group();
        group.getChildren().addAll(rect1,rect2);

        Scene scene = new Scene(group,500,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Translation Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
