package com.servicebus.service_bus.Services.Implements;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.servicebus.service_bus.DTO.BusDTO;
import com.servicebus.service_bus.Entity.Bus;
import com.servicebus.service_bus.Repositories.BusRepository;
import com.servicebus.service_bus.Repositories.Marca_busRepository;
import com.servicebus.service_bus.Services.BusService;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    BusRepository busRepository;

    @Autowired
    Marca_busRepository marca_busRepository;

    @Override
    public List<BusDTO> ObtenerTodosLosBuses() {
        List<Bus> buses = busRepository.findAll();
        return buses.stream().map(bus -> mapearDTO(bus)).collect(Collectors.toList());
    }

    @Override
    public BusDTO ObtenerBusPorId(Long id) {
        Bus bus = busRepository.findById(id).get();
        BusDTO busDTOrespuesta = mapearDTO(bus);
        return busDTOrespuesta;
    }

    @Override
    public Page<BusDTO> PaginacionBus(PageRequest paging) {
        Page<Bus> busPage = busRepository.findAll(paging);

        List<BusDTO> busDTOs = busPage.getContent().stream()
            .map(bus -> mapearDTO(bus)).collect(Collectors.toList());

        return new PageImpl<>(busDTOs, paging, busPage.getTotalElements());
    }

    // entidad a DTO
    private BusDTO mapearDTO(Bus bus) {
        BusDTO busDTO = new BusDTO();

        busDTO.setIdBus(bus.getIdBus());
        busDTO.setNumero_bus(bus.getNumero_bus());
        busDTO.setPlaca(bus.getPlaca());
        busDTO.setFecha_creacion(bus.getFecha_creacion());
        busDTO.setCaracteristicas(bus.getCaracteristicas());
        busDTO.setIdMarca_bus(bus.getMarca_bus().getIdMarca_bus());
        busDTO.setMarca(bus.getMarca_bus().getMarca());
        busDTO.setActividad(bus.isActividad());

        return busDTO;
    }

    // DTO a entidad
    /*
     * private Bus mapearEntidad(BusDTO busDTO){
     * Bus bus = new Bus();
     * 
     * bus.setIdBus(busDTO.getIdBus());
     * bus.setNumero_bus(busDTO.getNumero_bus());
     * bus.setPlaca(busDTO.getPlaca());
     * bus.setFecha_creacion(busDTO.getFecha_creacion());
     * bus.setCaracteristicas(busDTO.getCaracteristicas());
     * bus.setActividad(busDTO.isActividad());
     * 
     * Marca_bus marca_bus =
     * marca_busRepository.findById(busDTO.getIdMarca_bus()).orElse(null);
     * 
     * bus.setMarca_bus(marca_bus);
     * 
     * return bus;
     * }
     */
}
