package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class ObjectMaterial3D extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //let create the cylinder
        Cylinder cyn = new Cylinder();
        cyn.setRadius(70);
        cyn.setHeight(200);
        cyn.setTranslateX(180);
        cyn.setTranslateY(150);
        //let create another one
        Cylinder cyn1 = new Cylinder();
        cyn1.setRadius(70);
        cyn1.setHeight(200);
        cyn1.setTranslateY(150);
        cyn1.setTranslateX(380);
        //another one
        Cylinder cyn2 = new Cylinder();
        cyn2.setRadius(70);
        cyn2.setHeight(200);
        cyn2.setTranslateX(580);
        cyn2.setTranslateY(150);
        //Creating Sphere
        Sphere sp = new Sphere();
        sp.setRadius(70);
        sp.setTranslateX(780);
        sp.setTranslateY(150);
        //setting material.
        Image img1 = new Image("file:girl.JPG");
        PhongMaterial mat = new PhongMaterial();
        mat.setDiffuseMap(img1);
        mat.setDiffuseColor(Color.PALEGOLDENROD);
        //material2
        PhongMaterial mat2 = new PhongMaterial();
        mat2.setSelfIlluminationMap(img1);
        //material3
        PhongMaterial mat3 = new PhongMaterial();
        mat3.setSpecularMap(img1);
        //material for sphere
        PhongMaterial mat4 = new PhongMaterial();
        mat4.setDiffuseColor(Color.BLUE);

        //applying material to mat4.setBumpMap
        cyn.setMaterial(mat);
        cyn1.setMaterial(mat2);
        cyn2.setMaterial(mat3);
        sp.setMaterial(mat4);
        //setting camera mat4.setBumpMap(img1)
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(20);
        camera.setTranslateY(10);
        camera.setTranslateZ(50);

        //setting group and stage

        Group root = new Group();
        root.getChildren().addAll(cyn,cyn1,cyn2,sp);

        Scene scene = new Scene(root,900,300,Color.RED);
        scene.setCamera(camera);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MaterialExample");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
