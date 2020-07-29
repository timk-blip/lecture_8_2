package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberOfRadioStations = 10;
    private int currentStation = 5;
    private int volume = 20;
    private boolean on = true;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > getNumberOfRadioStations()) {
            currentStation = 0;
        }
        if (currentStation < 0) {
            currentStation = getNumberOfRadioStations();
        }
        this.currentStation = currentStation;
    }

    public void scrollingUpStation() {
        if (currentStation < getNumberOfRadioStations()) {
            currentStation++;
        } else {
        }
        return;
    }

    public void scrollingDownStation() {
        if (currentStation > 0) {
            currentStation--;
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 100) {
            volume = 100;
        }
        if (volume <= 0) {
            volume = 0;
        }
        this.volume = volume;
    }


    public void scrollingUpVolume() {
        if (volume < 100) {
            volume++;
        } else {
        }
        return;
    }

    public void scrollingDownVolume() {
        if (volume > 0) {
            volume--;
        } else {
        }
        return;
    }

}


