package ru.BashTeam.singlePage.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.BashTeam.singlePage.models.*;
import ru.BashTeam.singlePage.repositories.*;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class CarsService {

    private final CarCharacteristicRepository carCharacteristicRepository;
    private final CarCharacteristicValueRepository carCharacteristicValueRepository;
    private final CarGenerationRepository carGenerationRepository;
    private final CarMarkRepository carMarkRepository;
    private final CarModelRepository carModelRepository;
    private final CarModificationRepository carModificationRepository;
    private final CarSerieRepository carSerieRepository;
    private final CarTypeRepository carTypeRepository;

    public List<CarCharacteristic> getAllCarsCharacteristic() {
        return carCharacteristicRepository.findAll();
    }

    public CarCharacteristic getCarCharacteristic(int id) {
        Optional<CarCharacteristic> getCharacteristic = carCharacteristicRepository.findById(id);
        return getCharacteristic.orElse(null);
    }

    public List<CarCharacteristicValue> getAllCarCharacteristicValue() {
        return carCharacteristicValueRepository.findAll();
    }

    public CarCharacteristicValue getCarCharacteristicValue(int id) {
        Optional<CarCharacteristicValue> carCharacteristicValue = carCharacteristicValueRepository.findById(id);
        return carCharacteristicValue.orElse(null);
    }

    public List<CarGeneration> getAllCarGeneration(){
        return carGenerationRepository.findAll();
    }

    public CarGeneration getCarGeneration(int id){
        Optional<CarGeneration> carGeneration = carGenerationRepository.findById(id);
        return carGeneration.orElse(null);
    }

    public List<CarMark> getAllCarMarks(){
        return carMarkRepository.findAll();
    }

    public CarMark getCarMark(int id){
        Optional<CarMark> carMark = carMarkRepository.findById(id);
        return carMark.orElse(null);
    }

    public List<CarModel> getAllCarModels(){
        return carModelRepository.findAll();
    }

    public CarModel getCarModel(int id){
        Optional<CarModel> carModel = carModelRepository.findById(id);
        return carModel.orElse(null);
    }

    public List<CarSerie> getAllCarSeries(){
        return carSerieRepository.findAll();
    }

    public CarSerie getCarSerie(int id){
        Optional<CarSerie> carSerie = carSerieRepository.findById(id);
        return carSerie.orElse(null);
    }

    public List<CarModification> getAllCarModification(){
        return carModificationRepository.findAll();
    }

    public CarModification getCarModification(int id){
        Optional<CarModification> carModification = carModificationRepository.findById(id);
        return carModification.orElse(null);
    }

    public List<CarType> getAllCarType(){
        return carTypeRepository.findAll();
    }

    public CarType getCarType(int id){
        Optional<CarType> carType = carTypeRepository.findById(id);
        return carType.orElse(null);
    }
}
