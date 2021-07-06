package com.example.springboot2.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Getter
@AllArgsConstructor
public class RoomRequestDto {

    @NotNull(message = "La habitación no tiene nombre")
    private String name;

    @Min(message = "Largo mínimo 2.", value = 2)
    private double length;

    @Min(message = "Ancho mínimo 2.", value = 2)
    private double width;
}
