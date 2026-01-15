package application;
	
<<<<<<< HEAD
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
=======
import java.sql.Connection;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	static Connection conn = DBConnect.getConnection();
	@Override
	public void start(Stage primaryStage) {
		try {
			 if (conn != null) {
		            System.out.println("Connected!");
		        } else {
		            System.out.println("X");
		        }
			primaryStage.setScene(new CustomerScene(primaryStage).createScene());
			primaryStage.setTitle("Customer Stage");
>>>>>>> branch 'master' of https://github.com/sajahammad2005/DB_Project
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
