import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TodasGraphicInterface extends Application {
	static Stage signUp;
	static Stage code;
	static Stage menu;
	static Stage email;

	void launcher() {
		launch(null);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		signUp = new Stage();
		URL res = getClass().getClassLoader().getResource("practica1.fxml");
		Parent root = FXMLLoader.load(res);
		Scene scene = new Scene (root);
		signUp.setTitle("Hello!");
		signUp.setScene(scene);
		signUp.show();
		
		code = new Stage();
		URL res1 = getClass().getClassLoader().getResource("code.fxml");
		Parent root1 = FXMLLoader.load(res1);
		Scene scene1 = new Scene (root1);
		code.setTitle("Code");
		code.setScene(scene1);
		
		menu = new Stage();
		URL res2 = getClass().getClassLoader().getResource("menu.fxml");
		Parent root2 = FXMLLoader.load(res2);
		Scene scene2 = new Scene (root2);
		menu.setTitle("Menu");
		menu.setScene(scene2);
		
		email = new Stage();
		URL res3 = getClass().getClassLoader().getResource("email.fxml");
		Parent root3 = FXMLLoader.load(res3);
		Scene scene3 = new Scene (root3);
		email.setTitle("new email.");
		email.setScene(scene3);
	}

}
