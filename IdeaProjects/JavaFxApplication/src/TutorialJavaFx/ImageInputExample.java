package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ImageInputExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception { //problem in image source
        Image img = new Image("file:girl.JPG");
        ImageInput imginput = new ImageInput();
        Rectangle rect = new Rectangle();
        imginput.setSource(img);
        imginput.setX(20);
        imginput.setY(100);
        Group root = new Group();
        rect.setEffect(imginput);
        root.getChildren().add(rect);

        Scene scene = new Scene(root,530,500, Color.RED);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ImageInputExample");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
