package com.popov.HomeWork.FarmDog.Pets;

// места для службы сделаем в виде списка именнованных констант
public enum ServePlaces {
    POLICE("Милиция"), NINE_ONE_ONE("МЧС");

    private final String place;

    ServePlaces(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
