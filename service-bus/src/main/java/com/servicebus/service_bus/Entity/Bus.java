package com.servicebus.service_bus.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbus") 
    private Long idBus;

    @Column(name = "Numero_bus")
    private String Numero_bus;

    @Column(name = "Placa")
    private String Placa;

    @Column(name ="fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime Fecha_creacion;

    @Column(name ="Caracteristicas")
    private String Caracteristicas;

    @ManyToOne
    @JoinColumn(name = "idmarca_bus", nullable = false)
    private Marca_bus marca_bus;

    @Column(name ="Actividad")
    private boolean Actividad;

}
