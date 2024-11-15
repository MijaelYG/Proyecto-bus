package com.servicebus.service_bus.DTO;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class BusDTO {

    private Long idBus;

    private String Numero_bus;

    private String Placa;

    private LocalDateTime Fecha_creacion;

    private String Caracteristicas;

    private Long idMarca_bus;

    private String Marca;

    private boolean Actividad;
}
