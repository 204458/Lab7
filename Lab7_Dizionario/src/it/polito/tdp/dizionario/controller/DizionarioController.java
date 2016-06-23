package it.polito.tdp.dizionario.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.dizionario.model.DizionarioModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DizionarioController {

	private DizionarioModel model ;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtLettere;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnGeneraGrafo;

    @FXML
    private Button btnTrovaVicini;

    @FXML
    private Button btnTrovaTuttiIConnessi;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doGeneraGrafo(ActionEvent event) {
    	int lunghezza = 0;
    	
    	model.trovaDizionario(lunghezza);
    }

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void doTrovaTuttiIConnessi(ActionEvent event) {

    }

    @FXML
    void doTrovaVicini(ActionEvent event) {

    }
    public void setModel( DizionarioModel model ) {
		this.model = model ;
    }

    @FXML
    void initialize() {
        assert txtLettere != null : "fx:id=\"txtLettere\" was not injected: check your FXML file 'Dizionario.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Dizionario.fxml'.";
        assert btnGeneraGrafo != null : "fx:id=\"btnGeneraGrafo\" was not injected: check your FXML file 'Dizionario.fxml'.";
        assert btnTrovaVicini != null : "fx:id=\"btnTrovaVicini\" was not injected: check your FXML file 'Dizionario.fxml'.";
        assert btnTrovaTuttiIConnessi != null : "fx:id=\"btnTrovaTuttiIConnessi\" was not injected: check your FXML file 'Dizionario.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Dizionario.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Dizionario.fxml'.";

    }
}
