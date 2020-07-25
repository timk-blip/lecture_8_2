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
}