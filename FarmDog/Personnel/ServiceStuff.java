package com.popov.HomeWork.FarmDog.Personnel;

import com.popov.HomeWork.FarmDog.FarmObjects.Aviary;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Pets.Dog;

/* В задании не подразумевается выполнение персоналом каких-то действий параллельно, их классификация или учет по именам,
поэтому этот класс без полей, который выполняет всё */
public class ServiceStuff {

    // метод кормежки собаки
    public void feedADog(Dog dog) {
        // Вне зависимости от того голодна ли собака их всех приводят на кормежку
        System.out.println(">>> Собака " + dog.getName() + " приведена на кормежку...");
        if (dog.isHungry()) { // если голодна, то выдается корм в зависимости от возраста
            if (dog.getAge() < 1.0) {
                System.out.println("... выдан корм для щенков");
            } else if (dog.getAge() >= 8.0) {
                System.out.println("... выдан корм для старых собак");
            } else {
                System.out.println("... выдан корм для взрослых собак");
            }
            dog.setHungry(false); // после кормежки делаем собаку не голодной
        } else {
            System.out.println(">>> Собака " + dog.getName() + " не голодна");
        }
    }

    // метод тренировки собаки на площадке
    public void trainADog(Dog dog, TrainingArea trainingArea) {
        if (dog.isNeedToTrain()) {
            if (dog.getAge() < 1.0) { // дополнительная проверка на возраст
                trainingArea.train(dog);
            }
        }
        /*else {
            System.out.println(">>> Собака " + dog.getName() + " не нуждается в дрессировке");
        }*/
    }

    // метод чистки вольеров
    public void clearAnAviary(Aviary aviary) {
        if (!aviary.isSettled()) {
            System.out.println(">>> Вольер №" + aviary.getOrdinalNumber() + " не заселен!");
        } else {
            // Чистка вольеров выполняется обязательно и по расписанию только в заселенных вольерах
            aviary.setClean(true);
            System.out.println(">>> Вольер №" + aviary.getOrdinalNumber() + " очищен!");
        }
    }

    // метод, по которому персонал отводит собаку по месту ее службы
    public void goToServe(Dog dog) {
        if (dog.getAge() > 1 && dog.getAge() < 8) {
            System.out.println(">>> Собака " + dog.getName() + " отправляется на службу...");
            dog.serve();
        }
        /*else {
            System.out.println(">>> Собака " + dog.getName() + " не находится на службе");
        }*/
    }

    // метод, по которому персонал отводит старых собак обратно в вольер
    public void returnToAviary(Dog dog) {
        // закреплять вольер за собакой не будем
        if (dog.getAge() >= 8) {
            System.out.println(">>> Собака " + dog.getName() + " отправляется обратно в вольер");
            // так мы переводим собаку к вечерней кормежке
            dog.setHungry(true);
        }
    }
}
