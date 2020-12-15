package com.popov.HomeWork.FarmDog.FarmObjects;

import com.popov.HomeWork.FarmDog.Pets.Dog;

public class TrainingArea {

    // Собака может быть успешно натренированна если только она находится на тренировочной площадке
    public void train(Dog dog) {
        System.out.println(">>> Щенок " + dog.getName() + " приведен на дрессировку...");
        // так как мы иммитируем всего лишь один день из жизни, будем считать, что после тренировки щенок стал обученным,
        // исключая наличие порога натренированности
        dog.setNeedToTrain(false);
        System.out.println("... дрессировка проведена успешно");
        // после дрессировки щенок хочет есть
        dog.setHungry(true);
    }
}
