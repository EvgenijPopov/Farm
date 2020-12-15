package com.popov.HomeWork.FarmDog.FarmBuilder;

import com.popov.HomeWork.FarmDog.FarmObjects.Aviary;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Personnel.ServiceStaff;
import com.popov.HomeWork.FarmDog.Personnel.Vet;
import com.popov.HomeWork.FarmDog.Pets.Dog;
import com.popov.HomeWork.FarmDog.Pets.ServePlaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// This class represent main opportunities of our Farm
public class Farm {

    // our aviaries in Farm
    private final List<Aviary> aviaryList;

    // area for train dogs
    private final TrainingArea trainingArea;

    // vet for checkUp and dogs healing
    private final Vet vet;

    // service staff
    private final ServiceStaff serviceStaff;

    // "список" собак
    private List<Dog> dogList;

    public Farm(List<Aviary> aviaryList, TrainingArea trainingArea,
                Vet vet, ServiceStaff serviceStaff) {
        this.aviaryList = aviaryList;
        this.trainingArea = trainingArea;
        this.vet = vet;
        this.serviceStaff = serviceStaff;
        System.out.println(">>> Ферма построена!");
    }

    // this method place our founded dogs into Farm (list)
    public void placeDogOnFarm(Dog... dogs) {
        for (Dog dog : dogs) {
            // with first try we create ArrayList
            if (dogList == null) {
                dogList = new ArrayList<>();
            }
            dogList.add(dog);
            System.out.println(">>> " + dog.getName() + " привезен на ферму");
        }
    }

    // this method settle our dogs
    public void settleDogsOnFarm(Dog... dogs) {
        int aviaryNumber = dogList.size(); // we assign the number to concrete aviary
        for (Dog dog : dogs) {
            Aviary aviary = new Aviary(aviaryNumber--);
            aviary.setSettled(true); // mark that it settled
            aviary.setClean(false); // mark that it need to be cleaned in future
            aviaryList.add(aviary); // than we add it to aviary list to manage
            System.out.println(">>> " + dog.getName() + " заселен на ферму. Вольер №" + aviary.getOrdinalNumber());
            // here we choose where dog will serve
            if (dog.getAge() > 1 && dog.getAge() < 8) {
                whereToServe(dog);
            }
        }
    }

    // it is a random choice where dog will serve
    private void whereToServe(Dog dog) {
        Random random = new Random();
        if (random.nextBoolean()) {
            dog.setWhereToServe(ServePlaces.POLICE);
        } else {
            dog.setWhereToServe(ServePlaces.NINE_ONE_ONE);
        }
    }

    // this method simulate one day on Farm
    public void runOneFarmDay() {
        // at first, we check dog cards
        showDogsStatus();
        // morning feed
        for (Dog dog : dogList) {
            serviceStaff.feedADog(dog);
        }
        System.out.println("__________________________");
        // check up & heal
        for (Dog dog : dogList) {
            vet.checkUp(dog);
        }
        System.out.println("__________________________");
        // aviaries cleaning
        for (Aviary aviary : aviaryList) {
            serviceStaff.clearAnAviary(aviary);
        }
        System.out.println("__________________________");
        // training / serve / rest
        for (Dog dog : dogList) {
            serviceStaff.trainADog(dog, trainingArea);
            serviceStaff.goToServe(dog);
            serviceStaff.returnToAviary(dog);
        }
        System.out.println("__________________________");
        // evening feed
        for (Dog dog : dogList) {
            serviceStaff.feedADog(dog);
        }
        System.out.println("__________________________");
        // in the end another check
        showDogsStatus();
    }

    // this method display dog status in console
    private void showDogsStatus() {
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
        System.out.println("__________________________");
    }

}
