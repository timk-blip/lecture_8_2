package ru.netology;

public class Radio {

    private int currentStation = 5;
    private int volume = 5;
    private boolean on = true;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            currentStation = 0;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 10) {
            volume = 10;
        }
        if (volume <= 0) {
            volume = 0;
        }
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void scrollingUpStation() {
        if (currentStation < 9) {
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

    public void scrollingUpVolume() {
        if (volume < 10) {
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


