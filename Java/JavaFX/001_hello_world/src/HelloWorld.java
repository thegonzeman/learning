// THIS IS NOT MY PROGRAM.
// I'm following Oracle's tutorial:
// https://docs.oracle.com/javase/8/javafx/get-started-tutorial/hello_world.htm

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * The main class for a JavaFX application extends the javafx.application.Application class. The start() method is the
 * main entry point for all JavaFX applications.
 * <p>
 * A JavaFX application defines the user interface container by means of a stage and a scene. The JavaFX Stage class is
 * the top-level JavaFX container. The JavaFX Scene class in the container for all content. This example creates the
 * stage and scene and makes the scene visible in a given pixel size.
 * <p>
 * In JavaFX, the content of the scene is represented as a hierarchical scene graph of nodes. In this example, the root
 * node is a StackPane object, which is a resizable layout node. This means that the root node's size tracks the scene's
 * size and changes when the stage is resized by a user.
 * <p>
 * The root node contains one child node, a button control with text, plus an event handler to print a message when the
 * button is pressed.
 * <p>
 * The main() method is not required for JavaFX applications when the JAR file for the application is created with the
 * JavaFX Packager tool, which embeds the JavaFX Launcher in the JAR file. However, it is useful to include the main()
 * method so you can run JAR files that were created the JavaFX Launcher, such as when using an IDE in which the JavaFX
 * toos are not fully integrated. Also, Swing applications that embed JavaFX code require the main method.
 */
public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
