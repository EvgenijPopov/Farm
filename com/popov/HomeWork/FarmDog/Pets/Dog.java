package com.popov.HomeWork.FarmDog.Pets;

public class Dog {

    // dog's name
    private String name;

    // it age
    private double age;

    // health condition
    private boolean isHealthy;

    // is it hungry
    private boolean isHungry;

    // is it trained
    private boolean needToTrain;

    // some dogs will known where will serve
    private ServePlaces whereToServe;

    /* We suppose that when dogs were arrived to Farm,
    they were examined by the vet and the staff participating in the training,
    and they got cards with the name, age and other conditions of the dog (no null)
    and no new dogs were received during the simulated day*/

    public Dog(String name, double age, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.isHealthy = isHealthy;
        // Every dog want to eat
        this.isHungry = true;
        // Suppose that all puppies in Farm must pass training
        this.needToTrain = (this.age < 1);
    }

    public void serve() {
        System.out.println(name + " служит в " + whereToServe.getPlace());
        // after serve adult dog want to eat
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
        // override this method to display info about dog
        return "Dog Card: " +
                "|name = '" + name + '\'' +
                "|, |age = " + age +
                "|, |is Healthy = " + isHealthy +
                "|, |is Hungry = " + isHungry +
                "|, |need to be trained = " + needToTrain +
                ((age > 1 && age < 8) ? ",| Serve in: " + whereToServe.getPlace() : ",| Not in service!");
    }
}
