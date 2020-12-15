package com.popov.HomeWork.FarmDog.FarmObjects;

public class Aviary {

    private int ordinalNumber;

    private boolean isClean;

    private boolean isSettled;

    // We assume that aviaries was bought clean and empty
    public Aviary(int ordinalNumber) {
        // to avoid static assume that aviary numbers input without repeats
        this.ordinalNumber = ordinalNumber;
        this.isClean = true;
        this.isSettled = false;
    }

    public int getOrdinalNumber() {
        return ordinalNumber;
    }

    public void setOrdinalNumber(int ordinalNumber) {
        this.ordinalNumber = ordinalNumber;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isSettled() {
        return isSettled;
    }

    public void setSettled(boolean settled) {
        isSettled = settled;
    }
}
