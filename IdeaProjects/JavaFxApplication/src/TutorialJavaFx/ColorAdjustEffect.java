package TutorialJavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorAdjustEffect extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image img1 = new Image("https://www.javatpoint.com/girl.JPG");//problem in source file
        Image img2 = new Image("https://www.javatpoint.com/girl.JPG");
        ImageView imageView1 = new ImageView(img1);
        ImageView imageView2 = new ImageView(img2);

        Text text1 = new Text(50,300,"a");
        Text text2 = new Text(355,300,"b");
        text1.setText("ColorAdjust Effect Applied");
        text2.setText("colorAdjust Effect not Applied");
        text1.setFont(Font.font("Courier 10 pitch", FontWeight.BOLD, FontPosture.REGULAR,16));
        text2.setFont(Font.font("Courier 10 pitch",FontWeight.BOLD,FontPosture.REGULAR,16));
        text1.setFill(Color.RED);
        text2.setFill(Color.RED);
        text1.setStroke(Color.BLACK);
        text2.setStroke(Color.BLACK);
        text1.setStrokeWidth(0.2);
        text2.setStrokeWidth(0.2);

        imageView1.setX(100);
        imageView1.setY(90);
        imageView2.setX(400);
        imageView2.setY(90);

        ColorAdjust c = new ColorAdjust();
        c.setBrightness(0.2);
        c.setContrast(0.1);
        c.setHue(0.3);
        c.setSaturation(0.45);
        imageView1.setEffect(c);

        Group root = new Group();
        root.getChildren().addAll(imageView1,imageView2,text1,text2);
        Scene scene = new Scene(root,700,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ColorAdjustEffectExample");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
