package de.uni_hannover.hci;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PaintController implements Initializable {

    @FXML
    private Canvas canvas;
    private GraphicsContext gc;

    @FXML
    private void handleMouseDragged(MouseEvent me) {
        gc.lineTo(me.getX(), me.getY());
        gc.stroke();
    }

    @FXML
    private void clearCanvas() {
        gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());
    }
    @FXML
    private void handleMousePressed(MouseEvent me) {
        gc.beginPath();
        gc.moveTo(me.getX(), me.getY());
        gc.stroke();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
    }
}
