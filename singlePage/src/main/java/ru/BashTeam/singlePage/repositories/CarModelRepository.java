package ru.BashTeam.singlePage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.BashTeam.singlePage.models.CarModel;
@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Integer> {
}
