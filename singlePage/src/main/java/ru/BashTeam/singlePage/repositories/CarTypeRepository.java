package ru.BashTeam.singlePage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.BashTeam.singlePage.models.CarType;
@Repository
public interface CarTypeRepository extends JpaRepository<CarType, Integer> {
}
