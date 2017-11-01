package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Label txtNombre;

    @FXML
    private Label txtEdad;

    @FXML
    private Label txtApellido;

    @FXML
    private TextField txtBuscar;

    public void actionBuscar(ActionEvent event) {
        try {
            System.out.println(Persona.buscarPorPosicion(txtBuscar.getText()));

        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }

}

