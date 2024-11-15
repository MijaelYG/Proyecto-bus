package com.servicebus.service_bus.Services;

import java.util.List;

import com.servicebus.service_bus.DTO.BusDTO;

public interface BusService {

    List <BusDTO> ObtenerTodosLosBuses();
    BusDTO ObtenerBusPorId(Long id);

}
