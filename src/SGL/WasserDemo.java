package SGL;

public class WasserDemo {
    public static void main(String[] args) {
        Wasserstand w1 = new Wasserstand(1, "Pip", "Graz", 23.45, 23.78, 31);
        Wasserstand w2 = new Wasserstand(2, "Pop", "Graz", 24.34, 12.34, 34);
        Wasserstand w3 = new Wasserstand(3, "Pap", "Graz", 23.33, 12.34, 12);

        WasserstandManager wmng = new WasserstandManager();
        wmng.addWasserstand(w1);
        wmng.addWasserstand(w2);
        wmng.addWasserstand(w3);

        System.out.println(wmng.findLastWasserstand());
        System.out.println(wmng.findForAlarmierung());

    }
}
