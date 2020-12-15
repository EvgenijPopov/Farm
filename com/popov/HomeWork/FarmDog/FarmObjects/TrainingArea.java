package com.popov.HomeWork.FarmDog.FarmObjects;

import com.popov.HomeWork.FarmDog.Pets.Dog;

public class TrainingArea {

    // Dog can be successfully train if it only in training area
    public void train(Dog dog) {
        System.out.println(">>> Щенок " + dog.getName() + " приведен на дрессировку...");
        // we assume that after one train puppy become trained and exclude training threshold
        dog.setNeedToTrain(false);
        System.out.println("... дрессировка проведена успешно");
        // after training puppy want to eat
        dog.setHungry(true);
    }
}
