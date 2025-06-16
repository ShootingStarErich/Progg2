package Aufgabe1_3;

public class Zaehler {

	int einer;
	int zehner;

	public Zaehler(int zehner, int einer) {

		this.einer = einer;
		this.zehner = zehner;

	}

	public void erhoeheUmEins() throws EinerUeberlauf {

		if (einer < 9) {
			einer++;
		} else {
			einer = 0;
			throw new EinerUeberlauf();
		}

	}

	public void erhoeheUmZehn() throws Ueberlauf {

		if (zehner < 9) {
			zehner++;
		} else {
			zehner = 0;
			throw new Ueberlauf();
		}

	}

	public void zaehlen() {

		try {
			erhoeheUmEins();
		} catch (EinerUeberlauf ei) {

			try {
				erhoeheUmZehn();
			} catch (Ueberlauf ea) {

			}

		}

	}

	public String toString() {
		return zehner + "" + einer;

	}
}
