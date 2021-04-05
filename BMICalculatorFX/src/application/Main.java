package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
//---------------------------------------------------------------------------
//
//Midterm Programming portion. BMI calculator with JavaFX
//
//Author: Mujahid Kazi
//Date: 04/04/2021
//Class: MET CS422
//Issues: None known
//
//Description:
//This program provides a JavaFX GUI for users to calculate their BMi.
//Features include a toggle radio button for metric and imperial unit systems
//


//
//Class: Driver
//
//Description:
//This class uses methods from other classes to put the program together.
//It is the driver of this program.
//

public class Main extends Application {
	@Override
	
	
///////////////////////////////////////////////////////////////////
/// start ///
/// Input : a Stage ///
/// Output: None///
/// Displays the stage and scene for the program based on the fxml file.
/// 
/// ///
///////////////////////////////////////////////////////////////////
	public void start(Stage primaryStage) {
		try {
			
			//retrieves XML file for the GUI
			Parent root = FXMLLoader.load(getClass().getResource("FXBMI.fxml"));
			//generates scene
			Scene scene = new Scene(root,400,400);
			//retrieves css file
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("BMI Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
///////////////////////////////////////////////////////////////////
/// main ///
/// Input : String[] args ///
/// Output: None///
/// Runs the program. Key methods are placed in to the main method to run the program.
/// 
/// ///
///////////////////////////////////////////////////////////////////

	
	public static void main(String[] args) {
		launch(args);
	}
}
