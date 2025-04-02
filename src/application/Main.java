package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); // importante para manipulação da tela antes de carregar
			Parent parent = loader.load(); // carregamento do loader
			Scene mainScene = new Scene(parent); // cena principal
			primaryStage.setScene(mainScene); // colocar palco principal de acordo com oq foi carregado no loader
			primaryStage.setTitle("Sistema de Carteirinhas"); // título da aba
			primaryStage.show(); // mostrar palco
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
