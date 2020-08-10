package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldScrollingUpStation() {
        radio = new Radio(75, 45, 0, 20, 20, 0, true);
        assertEquals(true, radio.isOn());
        int scroll = radio.getCurrentStation();
        radio.scrollingUpStation();
        assertEquals(scroll + 1, radio.getCurrentStation());
    }

    @Test
    void shouldScrollingDownStation() {
        radio = new Radio(75, 45, 0, 20, 20, 0, true);
        assertEquals(true, radio.isOn());

        int scroll = radio.getCurrentStation();
        radio.scrollingDownStation();
        assertEquals(scroll - 1, radio.getCurrentStation());

    }

    @Test
    void shouldScrollingUpStationBranchElse() {
        radio = new Radio(75, 45, 0, 20, 20, 0, true);
        assertEquals(true, radio.isOn());

        radio.setCurrentStation(76);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void shouldScrollingDownStationBranchElse() {
        radio = new Radio(75, 45, 0, 20, 20, 0, true);
        assertEquals(true, radio.isOn());

        radio.setCurrentStation(-1);
        assertEquals(75, radio.getCurrentStation());

    }

    @Test
    void shouldScrollingUpStationCountBranchElse() {
        radio = new Radio(76, 45, 0, 20, 20, 0, true);
        assertEquals(true, radio.isOn());


        radio.setCurrentStation(radio.getNumberOfRadioStations());
        radio.scrollingUpStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldScrollingDownStationCountBranchElse() {

        assertEquals(true, radio.isOn());

        radio.setCurrentStation(0);
        radio.scrollingDownStation();
        assertEquals(10, radio.getCurrentStation());

    }

    @Test
    void shouldScrollingUpVolume() {

        assertEquals(true, radio.isOn());

        radio.setVolume(13);
        radio.scrollingUpVolume();
        assertEquals(14, radio.getVolume());

    }

    @Test
    void shouldScrollingDownVolume() {

        assertEquals(true, radio.isOn());

        radio.setVolume(-104);
        assertEquals(0, radio.getVolume());

    }

    @Test
    void shouldScrollingUpVolumeCount() {

        assertEquals(true, radio.isOn());

        radio.setVolume(50);
        radio.scrollingUpVolume();
        assertEquals(20, radio.getVolume());

    }

    @Test
    void shouldScrollingDownVolumeCount() {

        assertEquals(true, radio.isOn());

        radio.setVolume(15);
        radio.scrollingDownVolume();
        assertEquals(14, radio.getVolume());

    }

    @Test
    void shouldScrollingUpVolumeCountBranchElse() {

        assertEquals(true, radio.isOn());

        radio.setVolume(100);
        radio.scrollingUpVolume();
        assertEquals(20, radio.getVolume());

    }

    @Test
    void shouldScrollingDownVolumeCountBranchElse() {

        assertEquals(true, radio.isOn());

        radio.setVolume(0);
        radio.scrollingDownVolume();
        assertEquals(0, radio.getVolume());

    }
}