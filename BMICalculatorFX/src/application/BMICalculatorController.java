package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
    void calculateButtonPressed(ActionEvent event) {
    	
    	try {
    		double weight = Double.parseDouble(this.weightTextField.getText());
    		double height = Double.parseDouble(this.heightTextField.getText());
    		
    		double total = (weight/Math.pow(height, 2));
    		
    		if(metricRadioButton.isSelected()) {
    			
    		}else {
    			total *= 703;
    		}
    		
    		bmiTextField.setText(String.valueOf(total));
    		if(total < 18.5) {
    			categoryTextField.setText("Underweight");
    			
    		}else if(total >= 18.5 && total <= 24.9) {
    			categoryTextField.setText("Healthy Weight");
    			
    		}else if(total <= 25 && total <29.9) {
    			categoryTextField.setText("Overweight");
    			
    		}else if(total > 30) {
    			categoryTextField.setText("Obese");
    			
    		}
    		
    	} catch (NumberFormatException ex){
    		System.out.println("Number Format Exception");
    		
    		heightTextField.setText("Enter Correct Amount");
    		heightTextField.selectAll();
    		heightTextField.requestFocus();
    		
    		weightTextField.setText("Enter Correct Amount");
    		weightTextField.selectAll();
    		weightTextField.requestFocus();
    		
    	}

    }

    @FXML
    void radioButtonChanged(ActionEvent event) {

    }

}
