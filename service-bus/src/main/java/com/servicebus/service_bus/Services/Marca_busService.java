package com.servicebus.service_bus.Services;

import java.util.List;

import com.servicebus.service_bus.DTO.Marca_busDTO;

public interface Marca_busService {

    List <Marca_busDTO> ObtenerTodosLasMarcas();
    Marca_busDTO ObtenerMarcasPorId(Long id);
    
}
