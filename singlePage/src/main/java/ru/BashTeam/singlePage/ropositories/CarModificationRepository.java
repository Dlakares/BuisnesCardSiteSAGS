package ru.BashTeam.singlePage.ropositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.BashTeam.singlePage.models.CarModification;

@Repository
public interface CarModificationRepository extends JpaRepository<CarModification, Integer> {
}
