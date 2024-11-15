package com.servicebus.service_bus.Services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.servicebus.service_bus.DTO.BusDTO;

public interface BusService {

    List <BusDTO> ObtenerTodosLosBuses();
    Page<BusDTO>  PaginacionBus(PageRequest paging);
    BusDTO ObtenerBusPorId(Long id);

}
