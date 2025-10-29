package exercise5;

public class Radio {

    public boolean isON;
    public int volume;
    public double frequency;

    // Konstruktor
    public Radio(boolean isON, int volume, double frequency) { // bauplaln für einen radio
        this.isON = isON;
        this.volume = volume;
        this.frequency = frequency;
    }

    // Radio einschalten
    public void on() {
        isON = true;
        System.out.println("Radio wurde eingeschaltet."); // wenn true ist den radio an
    }

    // 2 Radio ausschalten
    public void off() {
        isON = false;
        System.out.println("Radio wurde ausgeschaltet."); // wenn der boolean false ist ist der boolean false
    }

    //  Lautstärke lautr machen
    public void increaseVolume() {
        if (isON) {
            if (volume < 100) {  // Wenn Lautstärke kleiner als 10 ist, kann sie noch erhöht werden
                volume++; // Lautstärke um 1 erhöhen
                System.out.println("Lautstärke erhöht auf " + volume);
            } else {  // Wenn Lautstärke bereits 100 ist, nicht weiter erhöhen
                System.out.println("Maximale Lautstärke erreicht.");
            }
        } else {
            System.out.println("Radio ist aus. Bitte zuerst einschalten."); // Wenn das Radio aus ist, Hinweis ausgeben
        }
    }

    //  Lautstärke leiser machen
    public void decreaseVolume() {
        if (isON) {
            if (volume > 0) { // Wenn Lautstärke größer als 0 ist, kann sie noch verringert werden
                volume--;  // Lautstärke um 1 verringern
                System.out.println("Lautstärke verringert auf " + volume);
            } else {  // Wenn Lautstärke bereits 0 ist, nicht weiter verringern
                System.out.println("Minimale Lautstärke erreicht.");
            }
        } else {
            System.out.println("Radio ist aus. Bitte zuerst einschalten."); // falls er noch nicht an ist
        }
    }

    // Sender (Frequenz) wechseln
    public void selectChannel(double frequency) {

        if (isON) {

            // Frequenz übernehmen jenachdem was der user eingegben hat
            this.frequency = frequency;

            // an dem user die mitteilung geben das die frequenz gewechselt wurde
            System.out.println("Sender gewechselt auf " + frequency + " MHz.");

        } else {
            // Wenn das Radio aus ist Hinweis ausgeben so das man in einschalten kann
            System.out.println("Radio ist aus. Bitte zuerst einschalten.");
        }
    }


    //
    @Override
    public String toString() {
        return "Radio{" +
                "isON=" + isON +
                ", volume=" + volume +
                ", frequency=" + frequency +
                '}';
    }
}

