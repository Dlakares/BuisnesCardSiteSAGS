package ru.BashTeam.singlePage.ropositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.BashTeam.singlePage.models.CarMark;

@Repository
public interface CarMarkRepository extends JpaRepository<CarMark, Integer> {
}
