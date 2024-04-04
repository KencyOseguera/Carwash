package hn.unah.lenguajes.datos.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;

@Entity
@Data
@Table(name="tipovehiculo")
public class TipoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipovehiculo")
    private Integer idTipoVehiculo;

    private String descripcion;

    @Column(name="precioxhora")
    private BigDecimal precioXhora;

    @OneToMany(mappedBy="tipoVehiculo")
    private List<Vehiculo> vehiculo;
}
