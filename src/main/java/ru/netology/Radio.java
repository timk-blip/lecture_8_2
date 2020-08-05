package ru.netology;

public class Radio {
    private int numberOfRadioStations = 10;
    private int currentStation = 5;
    private int minStation = 0;
    private int maxVolume = 20;
    private int volume = 20;
    private int minVolume = 0;
    private boolean on = true;

    public Radio() {
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > numberOfRadioStations) {
            this.currentStation = minStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = numberOfRadioStations;
            return;
        }
        this.currentStation = currentStation;
    }

    public void scrollingUpStation() {
        if (currentStation >= numberOfRadioStations) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void scrollingDownStation() {
        if (currentStation <= minStation) {
            currentStation = numberOfRadioStations;
            return;
        }
        currentStation--;
    }

    public void setVolume(int volume) {
        if (volume >= maxVolume) {
            this.volume = maxVolume;
            return;
        }
        if (volume <= minVolume) {
            this.volume = minVolume;
            return;
        }
        this.volume = volume;
    }

    public void scrollingUpVolume() {
        if (volume < maxVolume) {
            volume++;
        } else {
        }
        return;
    }

    public void scrollingDownVolume() {
        if (volume > minVolume) {
            volume--;
        } else {
        }
        return;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void setNumberOfRadioStations(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return on;
    }

}