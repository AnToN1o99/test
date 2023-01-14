package Domain;

public class Execute {
    public static void execute() {
        Main thisMain = Main.getInstance();
        Frazione f = thisMain.getFrazione();
        System.out.println(f.getNumeratore());
    }
}
