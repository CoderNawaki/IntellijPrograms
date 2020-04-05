package sample;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;
import java.time.Clock;

public class SphereExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Sphere sph = new Sphere();
        sph.setRadius(100);
        sph.setTranslateX(200);
        sph.setTranslateY(150);

        Image img1 = new Image("file:earth.jpeg");
        PhongMaterial mat = new PhongMaterial();
        mat.setDiffuseMap(img1);
        mat.setDiffuseColor(Color.WHITE);
        sph.setMaterial(mat);

        //create transition
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(10);
        rotate.setDuration(Duration.millis(1000));
        rotate.setAutoReverse(false);
        rotate.setNode(sph);
        rotate.play();

        //setting camera
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(-50);
        camera.setTranslateY(0);
        camera.setTranslateZ(0);
        //setting group and stage

        Group root = new Group();
        root.getChildren().add(sph);
        Scene scene = new Scene(root,500,300, Color.YELLOWGREEN);
        scene.setCamera(camera);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sphere  earth Example");
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
