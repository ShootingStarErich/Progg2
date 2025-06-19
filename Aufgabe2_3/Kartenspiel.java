package Aufgabe2_3;

import java.util.ArrayList;

public class Kartenspiel {

    public Kartenspiel() {
        Karte[] karten = new Karte[32];

        int index = 0;

        for (Karte.Farbe farbe : Karte.Farbe.values()) {
            for (Karte.Wert wert : Karte.Wert.values()) {
                karten[index] = new Karte(farbe, wert);
                index++;
            }
        }
    }

}
