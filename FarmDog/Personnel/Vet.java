package com.popov.HomeWork.FarmDog.Personnel;

import com.popov.HomeWork.FarmDog.Pets.Dog;

// В задании не подразумевается классификация врачей или то, что их несколько, поэтому просто класс Vet без полей
public class Vet {

    // Метод осмотра каждой собаки
    public void checkUp(Dog dog) {
        System.out.println(">>> Собака " + dog.getName() + " приведена на осмотр...");
        if (dog.isHealthy()) {
            System.out.println("... осмотр завершен, собака не нуждается в лечении!");
        } else {
            // и при необходимости проводится лечение
            heal(dog);
        }
    }

    // метод лечения, который может быть вызван и из вне
    public void heal(Dog dog) {
        System.out.println(">>> Собака " + dog.getName() + " нуждается в лечении...");
        dog.setHealthy(true); // мы не допускаем возможности того, что собака останется больной
        System.out.println("... собака вылечена!");
    }
}
