package com.servicebus.service_bus.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicebus.service_bus.Entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    
    @SuppressWarnings("null")
    Page<Bus> findAll(Pageable pageable);

}
