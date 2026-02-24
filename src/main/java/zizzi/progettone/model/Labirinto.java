package zizzi.progettone.model;

// Classe che rappresenta l'intero labirinto.
// Contiene la griglia di celle.
// Si occupa di sapere cosa c'è in ogni posizione.
// Controlla se una posizione è valida (non è un muro).
// Non sa nulla della grafica o dei bottoni.
public class Labirinto {
    private int riga;
    private int colonna;
    Cella[][] griglia;

    public Labirinto(int riga, int colonna, Cella[][] griglia) {
        this.riga = riga;
        this.colonna = colonna;
        this.griglia = griglia;
    }

    public int getRiga() {
        return riga;
    }

    public int getColonna() {
        return colonna;
    }

    public void mossaValida(int riga, int colonna) {

    }

    public void stampaLabirinto() {

    }
}
