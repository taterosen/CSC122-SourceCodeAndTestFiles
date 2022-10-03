package examples;

import java.io.File;

/**
 * Media example from Ch 16 (p677-678)
 * @author taterosen
 * 12/01/2020
 */



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MediaDemo extends Application {

	private static final String MEDIA_URL = "Explosion1.mp3";
	
	@Override
	public void start(Stage primaryStage) {
		Media media = new Media(new File(MEDIA_URL).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		//MediaView mediaView = new MediaView(mediaPlayer);
		
		Button playButton = new Button(">");
		playButton.setOnAction(e -> {
			if(playButton.getText().equals(">")) { 
				mediaPlayer.play();
				playButton.setText("||");
			} else {
				mediaPlayer.pause();
				playButton.setText(">");
			}
		});
		
		Button rewindButton = new Button("<<");
		rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));
		
		Slider slVolume = new Slider();
		slVolume.setPrefWidth(150);
		slVolume.setMaxWidth(Region.USE_PREF_SIZE);
		slVolume.setMinWidth(30);
		slVolume.setValue(50);
		mediaPlayer.volumeProperty().bind(slVolume.valueProperty().divide(100));
		
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(playButton, rewindButton, new Label("Volume"), slVolume);
		
		BorderPane pane = new BorderPane();
		//pane.setCenter(mediaView);
		pane.setBottom(hBox);
		
		
		Scene scene = new Scene(pane, 650, 500);
		primaryStage.setTitle("MediaDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}



}
