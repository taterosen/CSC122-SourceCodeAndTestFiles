package examples;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorldWait extends Application {
 
    private static Label label;
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        label = new Label();
        label.setText("Waiting...");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
 
        Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
                label.setText("Hello World");
            }
        });
        new Thread(sleeper).start();
    }
}