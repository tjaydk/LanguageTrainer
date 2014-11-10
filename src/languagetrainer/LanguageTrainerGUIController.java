/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagetrainer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.util.Scanner;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author Dennis
 */
public class LanguageTrainerGUIController implements Initializable {

    /////////////////////////////////////////////////////////////////////
    /**
     * This is the controller which holds the methods for the application
     */
    /////////////////////////////////////////////////////////////////////
    
    private String question;
    private String guess;
    private boolean answer;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    /////////////////////////////////////////////////////////////////////
    /*
    These methods control the different buttons for the application
    */
    /////////////////////////////////////////////////////////////////////
    
    public void newButtonAction(ActionEvent event) {
        
    }
    
    public void guessButtonAction(ActionEvent event) {
        
    }
    
    public void createButtonAction(ActionEvent event) {
        
    }
    
    public void lookUpButtonAction(ActionEvent event) {
        
    }
    
    /////////////////////////////////////////////////////////////////////
    /*
    This part is the getters and setters for the question and the answer
    */
    /////////////////////////////////////////////////////////////////////
    
    public String getQuestion() {
        return question;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public String getGuess() {
        return guess;
    }
    
    public void setGuess(String guess) {
        this.guess = guess;
    }
}
