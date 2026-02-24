package zizzi.progettone.controller;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class GiocoController {

    @FXML
    private GridPane griglia;

    @FXML
    public void initialize() {
        System.out.println("Gioco inizializzato");
    }

    @FXML
    private void gestisciTastiera(KeyEvent event) {

        switch (event.getCode()) {
            case UP:
                System.out.println("Su");
                break;
            case DOWN:
                System.out.println("Giù");
                break;
            case LEFT:
                System.out.println("Sinistra");
                break;
            case RIGHT:
                System.out.println("Destra");
                break;
        }
    }
}