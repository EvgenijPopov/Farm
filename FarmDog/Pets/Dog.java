package com.popov.HomeWork.FarmDog.Pets;

// Будем рассматривать собаку как объект привезенный в питомник
public class Dog {

    // имя собаки
    private String name;

    // ее возраст
    private double age;

    // состояние здоровья
    private boolean isHealthy;

    // накормлена ли
    private boolean isHungry;

    // нуждается ли в дрессировке
    private boolean needToTrain;

    // знает, где служит
    private ServePlaces whereToServe;

    /* Допустим, что при приеме собак в питомник их осмотрел ветеринар
     и персонал, участвующий в дрессировке, и на них завели карточки,
     где определено имя, возраст и прочие состояния собаки (нет null)
     и новых собак в течении моделируемого дня не поступало */

    public Dog(String name, double age, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.isHealthy = isHealthy;
        // Все собаки хотят есть
        this.isHungry = true;
        // Допустим, что все щенки в питомнике должны пройти дрессировку,
        this.needToTrain = (this.age < 1);
    }

    public void serve() {
        System.out.println(name + " служит в " + whereToServe.getPlace());
        // после службы собака хочет есть
        isHungry = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isNeedToTrain() {
        return needToTrain;
    }

    public void setNeedToTrain(boolean needToTrain) {
        this.needToTrain = needToTrain;
    }

    public ServePlaces getWhereToServe() {
        return whereToServe;
    }

    public void setWhereToServe(ServePlaces whereToServe) {
        this.whereToServe = whereToServe;
    }

    @Override
    public String toString() {
        // Будем вызывать, чтобы узнать данные о собаке
        return "Dog Card: " +
                "|name = '" + name + '\'' +
                "|, |age = " + age +
                "|, |is Healthy = " + isHealthy +
                "|, |is Hungry = " + isHungry +
                "|, |need to be trained = " + needToTrain +
                ((age > 1 && age < 8) ? ",| Serve in: " + whereToServe.getPlace() : ",| Not in service!");
    }
}
