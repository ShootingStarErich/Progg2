package Aufgabe1_1;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Birthday {

    String s;

    public Birthday(String s) throws InvalidBirthdayException {
        this.s = s;

        checkDay(s);

    }

    public void checkDay(String s) throws InvalidBirthdayException {
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy"); // Format 02.06.2023
        df.setLenient(false);

        try {
            df.parse(s);
        } catch (ParseException e) {
            throw new InvalidBirthdayException("Falsches Datum: " + s);
        }
    }

    public String toString() {
        return s;
    };

}