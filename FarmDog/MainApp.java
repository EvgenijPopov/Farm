package com.popov.HomeWork.FarmDog;

import com.popov.HomeWork.FarmDog.FarmBuilder.Farm;
import com.popov.HomeWork.FarmDog.FarmBuilder.FarmBuilder;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Personnel.ServiceStuff;
import com.popov.HomeWork.FarmDog.Personnel.Vet;
import com.popov.HomeWork.FarmDog.Pets.Dog;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        /* Создадим собак:
        2 щенка => 1 здоровый и 1 заболел
        4 взрослые собаки => 3 здоровых и 1 заболела
        2 старика => 1 здоровый и 1 заболел */
        Dog Alex = new Dog("Alex", 0.5, true);
        Dog Bob = new Dog("Bob", 0.7, false);
        Dog Charley = new Dog("Charley", 2.3, true);
        Dog Dean = new Dog("Dean", 3.3, true);
        Dog Eva = new Dog("Eva", 5.0, true);
        Dog Frida = new Dog("Frida", 6.4, false);
        Dog George = new Dog("George", 8.0, true);
        Dog Henry = new Dog("Henry", 11.0, false);
        // Создаем "строителя" фермы
        FarmBuilder builder = new FarmBuilder();
        // Устанавливаем вольеры
        builder.deployAviaries(new ArrayList<>());
        // Устанавливаем зону для дрессировок
        builder.deployTrainingArea(new TrainingArea());
        // Нанимаем персонал
        builder.hireStuff(new ServiceStuff());
        // Нанимаем ветеринара
        builder.hireVet(new Vet());
        // Создаем ферму
        Farm dogFarm = builder.buildAFarm();
        System.out.println("__________________________");
        // Привозим и заселяем собак на ферму
        dogFarm.placeDogOnFarm(Alex, Bob, Charley, Dean, Eva, Frida, George, Henry);
        System.out.println("__________________________");
        dogFarm.settleDogsOnFarm(Alex, Bob, Charley, Dean, Eva, Frida, George, Henry);
        System.out.println("__________________________");
        // Запускаем один день
        dogFarm.runOneFarmDay();
    }
}
