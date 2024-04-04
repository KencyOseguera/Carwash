package hn.unah.lenguajes.datos.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Column;

@Entity
@Data
@Table(name="reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva")
    private Integer idReserva;

    private LocalDate fecha;

    private Integer dias;

    private BigDecimal total;



}
