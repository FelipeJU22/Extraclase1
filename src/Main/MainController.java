package Main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    FileChooser seleccionador = new FileChooser();


    @FXML

    void getText(MouseEvent event) {
        File archivo = seleccionador.showOpenDialog(new Stage());
        String arch = String.valueOf(archivo);


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
