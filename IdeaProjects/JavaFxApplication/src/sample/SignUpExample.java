package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class SignUpExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label firstName = new Label("First Name");
        Label lastName = new Label("Last Name");
        Label Email = new Label("Email ID");
        Label Password = new Label("Password");
        //text field
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 =  new TextField();
        //creating submit button
        Button Submit = new Button("Submit");
        Submit.setId("submit");
        Button Reset = new Button("Reset");
        //creating title
        Text title  = new Text();
        title.setText("Sign Up");
        title.setX(120);
        title.setY(120);
        title.setUnderline(true);
        title.setId("title");
        //creating gridPane
        GridPane root = new GridPane();
        //creating scene
        Scene scene = new Scene(root,400,400);

        root.addRow(0,title);
        root.addRow(2,firstName,tf1);
        root.addRow(3,lastName,tf2);
        root.addRow(4,Email,tf3);
        root.addRow(5,Password,tf4);
        root.addRow(7,Submit,Reset);

        root.setHgap(10);
        root.setVgap(10);

        root.getStylesheets().add("form.css");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
