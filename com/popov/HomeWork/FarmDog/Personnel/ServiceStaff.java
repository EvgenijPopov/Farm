package com.popov.HomeWork.FarmDog.Personnel;

import com.popov.HomeWork.FarmDog.FarmObjects.Aviary;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Pets.Dog;

public class ServiceStaff {

    public void feedADog(Dog dog) {
        // No matter is dog hungry or not, they are all brought to feed
        System.out.println(">>> Собака " + dog.getName() + " приведена на кормежку...");
        if (dog.isHungry()) { // if hungry, then feed is given away according to age
            if (dog.getAge() < 1.0) {
                System.out.println("... выдан корм для щенков");
            } else if (dog.getAge() >= 8.0) {
                System.out.println("... выдан корм для старых собак");
            } else {
                System.out.println("... выдан корм для взрослых собак");
            }
            dog.setHungry(false); // after feeding we make dog well-fed
        } else {
            System.out.println(">>> Собака " + dog.getName() + " не голодна");
        }
    }

    public void trainADog(Dog dog, TrainingArea trainingArea) {
        if (dog.isNeedToTrain()) {
            if (dog.getAge() < 1.0) {
                trainingArea.train(dog);
            }
        }
        /*else {
            System.out.println(">>> Собака " + dog.getName() + " не нуждается в дрессировке");
        }*/
    }

    public void clearAnAviary(Aviary aviary) {
        if (!aviary.isSettled()) {
            System.out.println(">>> Вольер №" + aviary.getOrdinalNumber() + " не заселен!");
        } else {
            // Aviaries cleaning is mandatory and execute on schedule and in unsettled aviaries only!
            aviary.setClean(true);
            System.out.println(">>> Вольер №" + aviary.getOrdinalNumber() + " очищен!");
        }
    }

    public void goToServe(Dog dog) {
        if (dog.getAge() > 1 && dog.getAge() < 8) {
            System.out.println(">>> Собака " + dog.getName() + " отправляется на службу...");
            dog.serve();
        }
        /*else {
            System.out.println(">>> Собака " + dog.getName() + " не находится на службе");
        }*/
    }

    public void returnToAviary(Dog dog) {
        if (dog.getAge() >= 8) {
            System.out.println(">>> Собака " + dog.getName() + " отправляется обратно в вольер");
            dog.setHungry(true); // here we bring old dogs to evening feed
        }
    }
}
