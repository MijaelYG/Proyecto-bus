package com.servicebus.service_bus.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicebus.service_bus.Entity.Marca_bus;

@Repository
public interface Marca_busRepository  extends JpaRepository <Marca_bus, Long>{

}
