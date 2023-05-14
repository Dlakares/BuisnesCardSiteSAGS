package ru.BashTeam.singlePage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.BashTeam.singlePage.models.CarCharacteristicValue;

@Repository
public interface CarCharacteristicValueRepository extends JpaRepository<CarCharacteristicValue, Integer> {
}
