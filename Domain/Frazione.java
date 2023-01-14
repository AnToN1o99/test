package Domain;

public class Frazione {
    private int numeratore;
    private int denominatore = 1;

    public Frazione(int numeratore, int denominatore){
        this.numeratore = numeratore;
        if (denominatore != 0) {
            this.denominatore = denominatore;
        }
    }

    public int getNumeratore() {
        return numeratore;
    }

    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
    }
}
