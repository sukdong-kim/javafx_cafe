package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Main extends Application {
	private static Stage primaryStage;
	public static Stage checkStage;
	public static Stage orderStage;
	public static String sw = "off";
	public static String position = null;
	public static String t_name;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		showMainView();
	}
	public void showMainView() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("메인 화면");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stopMainView() {
		primaryStage.close();
	}
	public static void showCheckView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("View.fxml"));
		AnchorPane checkView = loader.load();

		checkStage = new Stage();
		checkStage.setTitle("통계 화면");
		checkStage.initModality(Modality.WINDOW_MODAL);
		checkStage.initOwner(primaryStage);
		Scene scene = new Scene(checkView);
		checkStage.setScene(scene);
		checkStage.showAndWait();

	}
	
	public void stopCheckView() {
		checkStage.close();
	}
	
	public static void showOrderView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Menu.fxml"));
		AnchorPane orderView = loader.load();

		orderStage = new Stage();
		orderStage.setTitle("주문 화면");
		orderStage.initModality(Modality.WINDOW_MODAL);
		orderStage.initOwner(primaryStage);
		Scene scene = new Scene(orderView);
		orderStage.setScene(scene);
		orderStage.showAndWait();

	}
	
	public void stopOrderView() {
		orderStage.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
