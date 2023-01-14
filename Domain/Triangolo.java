package Domain;

public class Triangolo {
    private int numero_lati = 3;

    public Triangolo(int lati) {
        this.numero_lati = lati;
    }

    public int getNumero_lati() {
        return numero_lati;
    }

    public void setNumero_lati(int numero_lati) {
        this.numero_lati = numero_lati;
    }
}
