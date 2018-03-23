/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 01932258248
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField TxtNumero1, TxtNumero2, TxtResultado;
    
    @FXML
    private Button btnSoma;
    
    @FXML 
    private void somar(ActionEvent event) {
        Double num1 = Double.parseDouble(TxtNumero1.getText ());
        Double num2 = Double.parseDouble(TxtNumero2.getText ());
        Double result;
        result = (num1 + num2);
        TxtResultado.setText(result.toString());
    }
 @FXML 
    private void subtrair(ActionEvent event) {
        Double num1 = Double.parseDouble(TxtNumero1.getText ());
        Double num2 = Double.parseDouble(TxtNumero2.getText ());
        Double result;
        result = (num1 - num2);
        TxtResultado.setText(result.toString());
    }
    @FXML 
    private void multiplicar(ActionEvent event) {
        Double num1 = Double.parseDouble(TxtNumero1.getText ());
        Double num2 = Double.parseDouble(TxtNumero2.getText ());
        Double result;
        result = (num1 * num2);
        TxtResultado.setText(result.toString());
    }
    @FXML 
    private void dividir(ActionEvent event) {
        Double num1 = Double.parseDouble(TxtNumero1.getText ());
        Double num2 = Double.parseDouble(TxtNumero2.getText ());
        Double result;
        result = (num1 / num2);
        TxtResultado.setText(result.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
