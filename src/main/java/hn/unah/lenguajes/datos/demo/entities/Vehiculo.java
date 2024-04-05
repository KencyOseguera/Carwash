package hn.unah.lenguajes.datos.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
@Data
@Table(name="vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idvehiculo")
    private Integer idVehiculo;

    private String marca;

    private Integer anio;

    private Boolean disponible;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idtipovehiculo", referencedColumnName = "idtipovehiculo")
    private TipoVehiculo tipoVehiculo;

    //relacion de muchos a muchos
    @ManyToMany(mappedBy = "vehiculo")
    private List<Cliente> cliente;
    

}
