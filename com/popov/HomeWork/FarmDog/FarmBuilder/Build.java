package com.popov.HomeWork.FarmDog.FarmBuilder;

import com.popov.HomeWork.FarmDog.FarmObjects.Aviary;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Personnel.ServiceStaff;
import com.popov.HomeWork.FarmDog.Personnel.Vet;

import java.util.List;

// We delegate farm objects creation methods to separate interface
public interface Build {

    void deployAviaries(List<Aviary> aviaryList);

    void deployTrainingArea(TrainingArea trainingArea);

    void hireVet(Vet vet);

    void hireStaff(ServiceStaff stuff);

}
