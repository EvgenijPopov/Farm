package com.popov.HomeWork.FarmDog.FarmBuilder;

import com.popov.HomeWork.FarmDog.FarmObjects.Aviary;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Personnel.ServiceStuff;
import com.popov.HomeWork.FarmDog.Personnel.Vet;

import java.util.List;

// Это класс Строитель-Организатор Фермы
public class FarmBuilder implements Build {

    private List<Aviary> aviaryList;
    private TrainingArea trainingArea;
    private Vet vet;
    private ServiceStuff stuff;

    @Override
    public void deployAviaries(List<Aviary> aviaryList) {
        this.aviaryList = aviaryList;
    }

    @Override
    public void deployTrainingArea(TrainingArea trainingArea) {
        this.trainingArea = trainingArea;
    }

    @Override
    public void hireVet(Vet vet) {
        this.vet = vet;
    }

    @Override
    public void hireStuff(ServiceStuff stuff) {
        this.stuff = stuff;
    }

    // основной метод создания Фермы по всем 4 основным элементам
    public Farm buildAFarm() {
        return new Farm(aviaryList, trainingArea, vet, stuff);
    }
}
