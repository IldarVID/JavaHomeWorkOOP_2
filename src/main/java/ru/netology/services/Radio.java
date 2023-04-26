package ru.netology.services;

import java.util.SortedMap;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount-1;
    }




    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }

    }

    public void prevStation() {

        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }


    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

}


