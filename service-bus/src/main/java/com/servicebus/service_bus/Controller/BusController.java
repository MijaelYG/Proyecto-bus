package com.servicebus.service_bus.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.servicebus.service_bus.DTO.BusDTO;
import com.servicebus.service_bus.Services.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping()
    public ResponseEntity<?> findAll() {
        
        try {
            List<BusDTO> nuevoBusDTO = busService.ObtenerTodosLosBuses();
            return new ResponseEntity<>(nuevoBusDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } 
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        try {
            BusDTO busDTO = busService.ObtenerBusPorId(id);
            return new ResponseEntity<>(busDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/paginacion")
    public Page<BusDTO> getPaginatedBuses(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return busService.PaginacionBus(PageRequest.of(page, size));
    }
    
}
