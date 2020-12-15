package com.popov.HomeWork.FarmDog;

import com.popov.HomeWork.FarmDog.FarmBuilder.Farm;
import com.popov.HomeWork.FarmDog.FarmBuilder.FarmBuilder;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Personnel.ServiceStaff;
import com.popov.HomeWork.FarmDog.Personnel.Vet;
import com.popov.HomeWork.FarmDog.Pets.Dog;

import java.util.ArrayList;
public class MainApp {

    public static void main(String[] args) {
        /* Create dogs (found them):
        2 puppies => 1 is healthy and 1 is ill
        4 adult dogs => 3 are healthy and 1 is ill
        2 old dogs => 1 is healthy and 1 is ill */
        Dog Alex = new Dog("Alex", 0.5, true);
        Dog Bob = new Dog("Bob", 0.7, false);
        Dog Charley = new Dog("Charley", 2.3, true);
        Dog Dean = new Dog("Dean", 3.3, true);
        Dog Eva = new Dog("Eva", 5.0, true);
        Dog Frida = new Dog("Frida", 6.4, false);
        Dog George = new Dog("George", 8.0, true);
        Dog Henry = new Dog("Henry", 11.0, false);
        // Create the Farm Builder
        FarmBuilder builder = new FarmBuilder();
        // Deploy aviaries as List
        builder.deployAviaries(new ArrayList<>());
        // Deploy training area for dogs
        builder.deployTrainingArea(new TrainingArea());
        // Hire service stuff
        builder.hireStaff(new ServiceStaff());
        // Hire vet
        builder.hireVet(new Vet());
        // Than we create Farm
        Farm dogFarm = builder.buildAFarm();
        System.out.println("__________________________");
        // We bring and settle dogs to the Farm
        dogFarm.placeDogOnFarm(Alex, Bob, Charley, Dean, Eva, Frida, George, Henry);
        System.out.println("__________________________");
        dogFarm.settleDogsOnFarm(Alex, Bob, Charley, Dean, Eva, Frida, George, Henry);
        System.out.println("__________________________");
        // Run "one day on farm"
        dogFarm.runOneFarmDay();
    }
}
