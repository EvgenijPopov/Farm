package com.popov.HomeWork.FarmDog.FarmBuilder;

import com.popov.HomeWork.FarmDog.FarmObjects.Aviary;
import com.popov.HomeWork.FarmDog.FarmObjects.TrainingArea;
import com.popov.HomeWork.FarmDog.Personnel.ServiceStuff;
import com.popov.HomeWork.FarmDog.Personnel.Vet;

import java.util.List;

// Вынесем методы создания объектов фермы в отдельный интерфейс
public interface Build {

    void deployAviaries(List<Aviary> aviaryList);

    void deployTrainingArea(TrainingArea trainingArea);

    void hireVet(Vet vet);

    void hireStuff(ServiceStuff stuff);

}
