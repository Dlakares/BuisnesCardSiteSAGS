package ru.BashTeam.singlePage.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.BashTeam.singlePage.models.CarMark;
import ru.BashTeam.singlePage.services.CarsService;
import ru.BashTeam.singlePage.utils.CarErrorResponse;
import ru.BashTeam.singlePage.utils.CarException;

import java.util.List;

@RestController("/car")
@AllArgsConstructor
public class CarController {
    CarsService carsService;

    @GetMapping("/mark")
    public List<CarMark> getMarks(){
        return carsService.getAllCarMarks();
    }

    @ExceptionHandler
    private ResponseEntity<CarErrorResponse> handleException(CarException e){
        CarErrorResponse response = new CarErrorResponse(
                "Something wrong", System.currentTimeMillis()
        );

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
