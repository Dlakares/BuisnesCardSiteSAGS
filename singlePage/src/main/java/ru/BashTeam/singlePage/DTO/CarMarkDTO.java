package ru.BashTeam.singlePage.DTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import ru.BashTeam.singlePage.models.CarModel;
import ru.BashTeam.singlePage.models.CarType;

import java.util.List;

@Data
@AllArgsConstructor
public class CarMarkDTO {
    private int id;
    private String name;
    private String nameRus;
    private int typeId;
    private List<Integer> modelsId;
}
