package Aufgabe1_3;

public class Test {
    public static void main(String[] args) {

        Zaehler za = new Zaehler(9, 3);

        for (int i = 0; i < 5; i++) {

            za.zaehlen();

            System.err.println(za.toString());
        }

    }

}