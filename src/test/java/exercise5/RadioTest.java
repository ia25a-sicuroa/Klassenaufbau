package exercise5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio radio;

    @BeforeEach
    public void setUp() {
        // Erstelle ein Radio-Objekt mit Standardwerten:
        // aus, Lautstärke 50, Frequenz 99.9 MHz
        radio = new Radio(false, 50, 99.9);
    }

    @Test
    public void testOn() {
        radio.on();
        assertTrue(radio.isON, "Radio sollte eingeschaltet sein");
    }

    @Test
    public void testOff() {
        radio.on();
        radio.off();
        assertFalse(radio.isON, "Radio sollte ausgeschaltet sein");
    }

    @Test
    public void testIncreaseVolume() {
        radio.on();
        radio.volume = 10;
        radio.increaseVolume();
        assertEquals(11, radio.volume, "Lautstärke sollte um 1 erhöht werden");
    }

    @Test
    public void testIncreaseVolumeMax() {
        radio.on();
        radio.volume = 100;
        radio.increaseVolume();
        assertEquals(100, radio.volume, "Lautstärke darf 100 nicht überschreiten");
    }

    @Test
    public void testDecreaseVolume() {
        radio.on();
        radio.volume = 10;
        radio.decreaseVolume();
        assertEquals(9, radio.volume, "Lautstärke sollte um 1 verringert werden");
    }

    @Test
    public void testDecreaseVolumeMin() {
        radio.on();
        radio.volume = 0;
        radio.decreaseVolume();
        assertEquals(0, radio.volume, "Lautstärke darf nicht unter 0 fallen");
    }

    @Test
    public void testSelectChannel() {
        radio.on();
        radio.selectChannel(104.7);
        assertEquals(104.7, radio.frequency, "Frequenz sollte auf 104.7 gesetzt werden");
    }

    @Test
    public void testSelectChannelWhileOff() {
        // Radio ist aus, Frequenzwechsel sollte ignoriert werden
        radio.selectChannel(101.2);
        assertEquals(99.9, radio.frequency, "Frequenz sollte unverändert bleiben, da Radio aus ist");
    }

    @Test
    public void testToString() {
        String output = radio.toString();
        assertTrue(output.contains("isON="));
        assertTrue(output.contains("volume="));
        assertTrue(output.contains("frequency="));
    }
}
