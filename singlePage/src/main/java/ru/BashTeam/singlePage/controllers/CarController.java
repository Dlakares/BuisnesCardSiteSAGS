package ru.BashTeam.singlePage.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.BashTeam.singlePage.DTO.CarMarkDTO;
import ru.BashTeam.singlePage.models.CarMark;
import ru.BashTeam.singlePage.services.CarsService;

import java.util.List;

@RestController
@RequestMapping("/car")
@AllArgsConstructor
public class CarController {
    CarsService carsService;

    @GetMapping("/mark")
    public List<CarMarkDTO> getMarks(){
        return carsService.getAllCarMarks();
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
