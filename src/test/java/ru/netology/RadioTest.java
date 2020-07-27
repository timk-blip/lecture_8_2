package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldScrollingUpStation() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        int scroll = radio.getCurrentStation();
        radio.scrollingUpStation();
        assertEquals(scroll + 1, radio.getCurrentStation());
    }

    @Test
    void shouldScrollingDownStation() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        int scroll = radio.getCurrentStation();
        radio.scrollingDownStation();
        assertEquals(scroll - 1, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationUp() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.scrollingUpStation();
        int scroll = radio.getCurrentStation();
        radio.setCurrentStation(radio.getCurrentStation());
        assertEquals(scroll, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationDown() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.scrollingUpStation();
        int scroll = radio.getCurrentStation();
        radio.setCurrentStation(radio.getCurrentStation());
        assertEquals(scroll, radio.getCurrentStation());
    }

    @Test
    void shouldScrollingUpVolume() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        int scrolltemperature = radio.getVolume();
        radio.scrollingUpVolume();
        assertEquals(scrolltemperature + 1, radio.getVolume());
    }

    @Test
    void shouldScrollingDownVolume() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        int scrolltemperature = radio.getVolume();
        radio.scrollingDownVolume();
        assertEquals(scrolltemperature - 1, radio.getVolume());
    }

    @Test
    void shouldSetVolumeUp() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.scrollingUpVolume();
        int scroll = radio.getVolume();
        radio.setVolume(radio.getVolume());
        assertEquals(scroll, radio.getVolume());
    }

    @Test
    void shouldSetVolumeDown() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.scrollingDownVolume();
        int scroll = radio.getVolume();
        radio.setVolume(radio.getVolume());
        assertEquals(scroll, radio.getVolume());
    }

    @Test
    void shouldScrollingUpStationBranchElse() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());

    }
    @Test
    void shouldScrollingDownStationBranchElse() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.setCurrentStation(-15);
        assertEquals(9, radio.getCurrentStation());

    }
    @Test
    void shouldScrollingUpVolumeBranchElse() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.setVolume(15);
        assertEquals(10, radio.getVolume());

    }
    @Test
    void shouldScrollingDownVolumeBranchElse() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.setVolume(-15);
        assertEquals(0, radio.getVolume());
    }


    @Test
    void shouldScrollingUpVolumeCountBranchElse() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.setVolume(15);
        radio.scrollingUpVolume();
        assertEquals(10, radio.getVolume());

    }
    @Test
    void shouldScrollingDownVolumeCountBranchElse() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.setVolume(-15);
        radio.scrollingDownVolume();
        assertEquals(0, radio.getVolume());
    }
    @Test
    void shouldScrollingUpStationCountBranchElse() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());


        radio.setCurrentStation(9);
        radio.scrollingUpStation();
        assertEquals(9, radio.getCurrentStation());;
    }
    @Test
    void shouldScrollingDownStationCountBranchElse() {
        Radio radio = new Radio();
        assertEquals(true, radio.isOn());

        radio.setCurrentStation(0);
        radio.scrollingDownStation();
        assertEquals(0, radio.getCurrentStation());
    }



}