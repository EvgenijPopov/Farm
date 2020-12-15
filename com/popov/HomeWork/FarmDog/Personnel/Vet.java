package com.popov.HomeWork.FarmDog.Personnel;

import com.popov.HomeWork.FarmDog.Pets.Dog;

// This class doesn't have any field only methods
public class Vet {

    public void checkUp(Dog dog) {
        System.out.println(">>> Собака " + dog.getName() + " приведена на осмотр...");
        if (dog.isHealthy()) {
            System.out.println("... осмотр завершен, собака не нуждается в лечении!");
        } else {
            // if it necessary we heal the dog
            heal(dog);
        }
    }

    // this healing method can be called by itself
    public void heal(Dog dog) {
        System.out.println(">>> Собака " + dog.getName() + " нуждается в лечении...");
        dog.setHealthy(true); // we not assume that dog remain unhealthy
        System.out.println("... собака вылечена!");
    }
}
