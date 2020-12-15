package com.popov.HomeWork.FarmDog.FarmBuilder;

import com.popov.HomeWork.FarmDog.FarmObjects.Aviary;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Personnel.ServiceStaff;
import com.popov.HomeWork.FarmDog.Personnel.Vet;

import java.util.List;

// This class "organize & build" Farms
public class FarmBuilder implements Build {

    // Typically private fields for their build
    private List<Aviary> aviaryList;
    private TrainingArea trainingArea;
    private Vet vet;
    private ServiceStaff serviceStaff;

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
    public void hireStaff(ServiceStaff stuff) {
        this.serviceStaff = stuff;
    }

    // central method for Farm creation by 4 main Parts
    public Farm buildAFarm() {
        return new Farm(aviaryList, trainingArea, vet, serviceStaff);
    }
}
