package loginApplication;

import java.sql.DriverManager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApplication extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("login.fxml"));
		
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Product Manager");
		stage.setResizable(false);
		stage.show();
		
	}
	public static void main(String[] args){
		launch(args);
	}
	
	

}
