package ui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {

		launch();
	}

	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("minecraftUI.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		stage.getIcons().add(new Image("File:imgs/logo.png")); 
		stage.setTitle("Minecraft");
		stage.setScene(scene);
		stage.show();
	}


}