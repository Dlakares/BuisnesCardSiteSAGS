package ru.BashTeam.singlePage.ropositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.BashTeam.singlePage.models.CarSerie;

@Repository
public interface CarSerieRepository extends JpaRepository<CarSerie, Integer> {
}
