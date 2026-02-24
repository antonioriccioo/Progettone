package zizzi.progettone.model;
// Rappresenta una singola casella della griglia.
// Contiene un TipoCella.
// Non ha grafica.
// Serve solo a descrivere cosa c'è in quella posizione.
public class Cella {
    TipoCella tipo;
    private int riga;
    private int colonna;

    public Cella(TipoCella tipo, int riga, int colonna) {
        this.tipo = tipo;
        this.riga = riga;
        this.colonna = colonna;
    }

    public TipoCella getTipo() {
        return tipo;
    }

    public void setTipo(TipoCella tipo) {
        this.tipo = tipo;
    }

    public int getRiga() {
        return riga;
    }

    public int getColonna() {
        return colonna;
    }

    @Override
    public String toString() {
        switch (tipo) {
            case MURO:
                return "M";      // muro
            case PERCORSO:
                return "P";      // percorso libero
            case INIZIO:
                return "I";      // inizio
            case USCITA:
                return "U";      // uscita
            default:
                return "?";      // eventuale caso imprevisto
        }
    }
}
