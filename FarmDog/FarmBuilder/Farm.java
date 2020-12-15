package com.popov.HomeWork.FarmDog.FarmBuilder;

import com.popov.HomeWork.FarmDog.FarmObjects.Aviary;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Personnel.ServiceStuff;
import com.popov.HomeWork.FarmDog.Personnel.Vet;
import com.popov.HomeWork.FarmDog.Pets.Dog;
import com.popov.HomeWork.FarmDog.Pets.ServePlaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// класс, который отождествляет возможности нашей текущей фермы
public class Farm {

    // "список" вольеров
    private final List<Aviary> aviaryList;

    // площадка для тренировки
    private final TrainingArea trainingArea;

    // ветеринар
    private final Vet vet;

    // весь обслуживающий персонал
    private final ServiceStuff stuff;

    // "список" собак
    private List<Dog> dogList;

    public Farm(List<Aviary> aviaryList, TrainingArea trainingArea,
                Vet vet, ServiceStuff stuff) {
        this.aviaryList = aviaryList;
        this.trainingArea = trainingArea;
        this.vet = vet;
        this.stuff = stuff;
        System.out.println(">>> Ферма построена!");
    }

    // метод размещение собак на ферме (в списке)
    public void placeDogOnFarm(Dog... dogs) {
        for (Dog dog : dogs) {
            // при первом обращении заводим сам список
            if (dogList == null) {
                dogList = new ArrayList<>();
            }
            dogList.add(dog);
            System.out.println(">>> " + dog.getName() + " привезен на ферму");
        }
    }

    // метод заселения собак в вольеры
    public void settleDogsOnFarm(Dog... dogs) {
        int aviaryNumber = dogList.size(); // произвольная нумерация вольеров
        for (Dog dog : dogs) {
            Aviary aviary = new Aviary(aviaryNumber--); // присваиваем вольеру номер
            aviary.setSettled(true); // помечаем, что он заселен
            aviary.setClean(false); // помечаем, что его точно нужно чистить
            aviaryList.add(aviary); // добавляем его в "список" вольеров фермы
            System.out.println(">>> " + dog.getName() + " заселен на ферму. Вольер №" + aviary.getOrdinalNumber());
            // здесь же при заселении взрослым собакам выбирается место службы
            if (dog.getAge() > 1 && dog.getAge() < 8) {
                whereToServe(dog);
            }
        }
    }

    // выбор назначается в произвольном порядке
    private void whereToServe(Dog dog) {
        Random random = new Random();
        if (random.nextBoolean()) {
            dog.setWhereToServe(ServePlaces.POLICE);
        } else {
            dog.setWhereToServe(ServePlaces.NINE_ONE_ONE);
        }
    }

    // метод, иммитирующий день на ферме
    public void runOneFarmDay() {
        // проверяем карточки собак
        showDogsStatus();
        // кормежка
        for (Dog dog : dogList) {
            stuff.feedADog(dog);
        }
        System.out.println("__________________________");
        // осмотр (лечение)
        for (Dog dog : dogList) {
            vet.checkUp(dog);
        }
        System.out.println("__________________________");
        // чистка вольеров
        for (Aviary aviary : aviaryList) {
            stuff.clearAnAviary(aviary);
        }
        System.out.println("__________________________");
        // дрессировка / служба / отдых
        for (Dog dog : dogList) {
            stuff.trainADog(dog, trainingArea);
            stuff.goToServe(dog);
            stuff.returnToAviary(dog);
        }
        System.out.println("__________________________");
        for (Dog dog : dogList) {
            stuff.feedADog(dog);
        }
        System.out.println("__________________________");
        // проверим состояние собак к вечеру
        showDogsStatus();
    }

    // метод вывода переопределенного toString() собаки в консоль
    private void showDogsStatus() {
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
        System.out.println("__________________________");
    }

}
