package fr.cblancheton.automaton;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text("test");
        Button button = new Button("xd");
        Group group = new Group();
        group.getChildren().addAll(text, button);

        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
