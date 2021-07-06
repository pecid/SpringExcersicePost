package com.example.springboot2.dtos.response;

import com.example.springboot2.dtos.request.RoomRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class HouseResponseDto {

    private String validate;
    private double squareMeters;
    private String houseCost;
    private RoomRequestDto bigRoom;
    private Map<String, Integer> squareMetersRooms;


}
