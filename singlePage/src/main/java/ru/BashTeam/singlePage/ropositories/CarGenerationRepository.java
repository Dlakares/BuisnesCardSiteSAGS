package ru.BashTeam.singlePage.ropositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.BashTeam.singlePage.models.CarGeneration;

@Repository
public interface CarGenerationRepository extends JpaRepository<CarGeneration, Integer> {
}
