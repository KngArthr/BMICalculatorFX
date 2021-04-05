package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;



//
//Class: Driver
//
//Description:
//This class is the controller for the GUI of the BMI calculator. The objects corresponding to FXML
// file are created here.
//
public class BMICalculatorController {

    @FXML
    private TextField heightTextField;

    @FXML
    private TextField weightTextField;

    @FXML
    private RadioButton americanRadioButton;

    @FXML
    private ToggleGroup Unit;

    @FXML
    private RadioButton metricRadioButton;

    @FXML
    private TextField bmiTextField;

    @FXML
    private TextField categoryTextField;

    @FXML
    
///////////////////////////////////////////////////////////////////
/// calculateButtonPressed ///
/// Input : an event (usually button is pressed) ///
/// Output: None///
/// On the click of the button in the GUI, the following code runs
/// to calculate the BMI and display the appropriate values
/// 
/// ///
///////////////////////////////////////////////////////////////////
    void calculateButtonPressed(ActionEvent event) {
    	
    	try {
    		double weight = Double.parseDouble(this.weightTextField.getText());
    		double height = Double.parseDouble(this.heightTextField.getText());
    		
    		double total = (weight/Math.pow(height, 2));
    		//base equation is fine for metric system
    		if(metricRadioButton.isSelected()) {
    			total *= 10000;
    		}else {//imperial system if the appropriate button is selected
    			total *= 703;
    		}
    		
    		bmiTextField.setText(String.valueOf(total));
    		if(total < 18.5) {
    			categoryTextField.setText("Underweight");
    			
    		}else if(total >= 18.5 && total <= 24.9) {
    			categoryTextField.setText("Healthy Weight");
    			
    		}else if(total >= 25 && total <29.9) {
    			categoryTextField.setText("Overweight");
    			
    		}else if(total > 30) {
    			categoryTextField.setText("Obese");
    			
    		}
    		
    		//if anything but a number is used, then display the following text in the text fields.
    	} catch (NumberFormatException ex){
    		System.out.println("Number Format Exception");
    		
    		heightTextField.setText("Enter Correct Value");
    		heightTextField.selectAll();
    		heightTextField.requestFocus();
    		
    		weightTextField.setText("Enter Correct Value");
    		weightTextField.selectAll();
    		weightTextField.requestFocus();
    		
    	}

    }

    @FXML
    void radioButtonChanged(ActionEvent event) {

    }

}
