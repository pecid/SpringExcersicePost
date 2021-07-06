package com.example.springboot2.dtos.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomResponseDto {

    private String name;
    private double width;
    private double length;


}
