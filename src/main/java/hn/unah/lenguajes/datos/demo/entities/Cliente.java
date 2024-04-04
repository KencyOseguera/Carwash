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
import java.util.List;

import jakarta.persistence.Column;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

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

    //relacion de muchos a muchos
    @ManyToMany
    @JoinTable(name="reserva",
    joinColumns = @JoinColumn(name="codigocliente"),
    inverseJoinColumns = @JoinColumn(name="idvehiculo"))

    private List<Vehiculo> vehiculo;
    

}
