package hn.unah.lenguajes.datos.demo.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

import jakarta.persistence.Column;

@Entity
@Data
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "codigocliente")
    private Integer codigoCliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso")
    private LocalDate fechaIngreso;

    @ManyToOne
    @JoinColumn(name="idtipocliente", referencedColumnName="idtipocliente")
    private TipoCliente tipoCliente;

}
