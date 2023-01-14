package Domain;

public class Main {
    Frazione f = new Frazione(1,9);
    static private Main instance = null;

    private Main() {
    }

    public static Main getInstance(){
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }
}
