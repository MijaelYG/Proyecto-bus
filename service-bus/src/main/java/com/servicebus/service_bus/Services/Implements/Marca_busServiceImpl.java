package com.servicebus.service_bus.Services.Implements;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicebus.service_bus.DTO.Marca_busDTO;
import com.servicebus.service_bus.Entity.Marca_bus;
import com.servicebus.service_bus.Repositories.Marca_busRepository;
import com.servicebus.service_bus.Services.Marca_busService;

@Service
public class Marca_busServiceImpl implements Marca_busService {

    @Autowired
    Marca_busRepository marca_busRepository;

    @Override
    public List<Marca_busDTO> ObtenerTodosLasMarcas() {
        List <Marca_bus> marca_bus = marca_busRepository.findAll();
        return marca_bus.stream().map(marcabus -> mapearDTO(marcabus)).collect(Collectors.toList());
    }

    @Override
    public Marca_busDTO ObtenerMarcasPorId(Long id) {
        Marca_bus marca_bus = marca_busRepository.findById(id).get();
        Marca_busDTO marca_busDTO = mapearDTO(marca_bus);
        return marca_busDTO;
    }



    
    // entidad a DTO
    private Marca_busDTO mapearDTO(Marca_bus marca_bus) {
        Marca_busDTO marca_busDTO = new Marca_busDTO();

        marca_busDTO.setIdMarca_bus(marca_bus.getIdMarca_bus());
        marca_busDTO.setMarca(marca_bus.getMarca());

        return marca_busDTO;
    }

     // DTO a entidad
    /*private Marca_bus mapearEntidad(Marca_busDTO marca_busDTO) {
        Marca_bus marca_bus = new Marca_bus();

        marca_bus.setIdMarca_bus(marca_busDTO.getIdMarca_bus());
        marca_bus.setMarca(marca_busDTO.getMarca());

        return marca_bus;
    }*/

}
