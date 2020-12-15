package com.popov.HomeWork.FarmDog.FarmObjects;

// класс, определяющий Вольеры
public class Aviary {

    // порядковый номер
    private int ordinalNumber;

    // нуждается ли в очистке
    private boolean isClean;

    // заселен ли кем-то
    private boolean isSettled;

    // Допустим, что при создании фермы вольеры закупают чистые и, естественно, в них никого нет
    public Aviary(int ordinalNumber) {
        // чтобы, избежать статики, допустим, что номера вольеров вводятся без повторений (проверку проводить не будем)
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
