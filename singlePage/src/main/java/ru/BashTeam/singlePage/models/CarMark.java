package ru.BashTeam.singlePage.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "car_mark")
@Data
@NoArgsConstructor
public class CarMark {
    @Id
    @Column(name = "id_car_mark")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "name_rus")
    private String nameRus;
    @ManyToOne
    @JoinColumn(name = "id_car_type")
    private CarType type;
    @OneToMany(mappedBy = "mark")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarModel> models;

    public CarMark(String name, String nameRus, CarType type, List<CarModel> models) {
        this.name = name;
        this.nameRus = nameRus;
        this.type = type;
        this.models = models;
    }
}
