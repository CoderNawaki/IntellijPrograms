package sample;

import javafx.application.Application;//imported to our code

import javafx.scene.Scene;//scene holds all physical nodes of application.
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;// stage is similar to Frame and acts like a container.
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main extends Application {//inherited into our application class

    @Override   //overriding the start method of application class.
    public void start(Stage primaryStage) throws Exception{
        Button btn1 = new Button("Say Hello world");
        btn1.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent args){
                System.out.println("Hello world");
            }
        });

        StackPane root = new StackPane();//one of the javafx layout
        root.getChildren().add(btn1);

        Scene scene = new Scene(root,600,400);//creating ne scene

        primaryStage.setScene((scene));
        primaryStage.setTitle("First JavaFx Application");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
