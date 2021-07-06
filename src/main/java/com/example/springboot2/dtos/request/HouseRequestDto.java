package com.example.springboot2.dtos.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Validated
public class HouseRequestDto {

    @NotNull(message = "El nombre se encuentra null.")
    @NotBlank(message = "El nombre esta vacío.")
    private String name;

    @NotNull(message = "La dirección se encuentra null.")
    @NotBlank(message = "La dirección esta vacío.")
    private String address;

    @NotNull(message = "No hay habitaciones.")
    @NotEmpty(message = "No hay habitaciones en el arreglo.")
    private List<@Valid RoomRequestDto> rooms;
}
