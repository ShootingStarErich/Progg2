package Aufgabe2_3;

public record Karte(Farbe farbe, Wert wert) {

    public enum Farbe {
        KREUZ, PIK, HERZ, KARO
    }

    public enum Wert {
        SIEBEN, ACHT, NEUN, ZEHN, BUBE, DAME, KOENIG, ASS
    }

    public Karte(Karte andere) {
        this(andere.farbe, andere.wert);
    }

}
