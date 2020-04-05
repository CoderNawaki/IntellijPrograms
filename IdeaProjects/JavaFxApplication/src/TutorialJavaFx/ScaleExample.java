package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class ScaleExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle cir1 = new Circle(230,200,100);
        Circle cir2 = new Circle(550,200,100);

        cir1.setFill(Color.PURPLE);
        cir1.setStroke(Color.BLUE);
        cir2.setFill(Color.BLUE);
        cir2.setStroke(Color.BLACK);

        Text text1 = new Text("Original Circle");
        Text text2 = new Text("Scaled with factor 1.5 in XY");

        text1.setX(150);
        text1.setY(400);
        text2.setX(400);
        text2.setY(400);
        text1.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.ITALIC,20));
        text2.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.ITALIC,20));

        Scale scale = new Scale();
        //setting the pivot points along which the scalling is done,
        scale.setX(1.4);
        scale.setY(1.4);

        scale.setPivotX(550);
        scale.setPivotY(200);

        cir2.getTransforms().add(scale);

        Group group = new Group();
        group.getChildren().addAll(cir1,cir2,text1,text2);

        Scene scene = new Scene(group,800,450);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Scale Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
