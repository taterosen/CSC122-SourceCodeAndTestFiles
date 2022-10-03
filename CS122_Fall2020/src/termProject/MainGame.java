package termProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainGame extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
	/*@Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(Game.createContent());
        primaryStage.setTitle("Battleship");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        //primaryStage.show();
        startGame(primaryStage);
    }
	
	
	public void cleanup()
    {
    	//stop animations and reset model
		
    }
    
    public void startGame(Stage stage)
    {
    	//Button btnNewGame = new Button("Play Again");
    	Game.newGame.setOnAction(e -> {
    		restart(stage);
    	});
    	
    	stage.show();
    	
    }
    
    public void restart(Stage stage)
    {
    	cleanup();
    	startGame(stage);
    }
	
	
	public static void main(String[] args) {
        launch(args);
        
    }*/

}
