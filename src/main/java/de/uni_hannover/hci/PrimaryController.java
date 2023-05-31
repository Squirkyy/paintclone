package de.uni_hannover.hci;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void switchToPaint() throws IOException {
        App.setRoot("paintview");
    }
}
