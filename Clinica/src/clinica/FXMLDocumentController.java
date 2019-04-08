/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Javier
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button bAdd;
    @FXML
    private Button bDelete;
    @FXML
    private Button bInf;
    @FXML
    private Button bDoctorList;
    @FXML
    private Button bAppointmentList;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Add(ActionEvent event) {
    }

    @FXML
    private void Delete(ActionEvent event) {
    }

    @FXML
    private void Inf(ActionEvent event) {
    }

    @FXML
    private void DoctorList(ActionEvent event) {
    }

    @FXML
    private void AppointmentList(ActionEvent event) {
    }
    
}
