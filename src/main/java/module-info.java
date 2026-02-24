module zizzi.progettone {
    requires javafx.controls;
    requires javafx.fxml;


    opens zizzi.progettone to javafx.fxml;
    exports zizzi.progettone;
}