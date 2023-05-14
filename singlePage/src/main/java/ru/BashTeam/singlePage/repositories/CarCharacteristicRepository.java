package ru.BashTeam.singlePage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.BashTeam.singlePage.models.CarCharacteristic;

@Repository
public interface CarCharacteristicRepository extends JpaRepository<CarCharacteristic, Integer> {
}
