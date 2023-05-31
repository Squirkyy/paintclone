module de.uni_hannover.hci {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.uni_hannover.hci to javafx.fxml;
    exports de.uni_hannover.hci;
}
