package com.example.springboot2.controllers;


import com.example.springboot2.dtos.request.HouseRequestDto;
import com.example.springboot2.dtos.response.HouseResponseDto;
import com.example.springboot2.handlers.HouseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api-v3")
public class ControllerDto {

    @PostMapping("/square-meters")
    public ResponseEntity<HouseResponseDto> getHouseSquareMeters(@Valid @RequestBody HouseRequestDto house){
        HouseResponseDto houseResponseDto = new HouseResponseDto(
                HouseHandler.validateHouse(),
                HouseHandler.squareMeters(house.getRooms()),
                HouseHandler.houseCost(house.getRooms()),
                HouseHandler.bigRoom(house.getRooms()),
                HouseHandler.squareMetersRooms(house.getRooms())
                );

        return new ResponseEntity<>(houseResponseDto, HttpStatus.OK);
    }

}
