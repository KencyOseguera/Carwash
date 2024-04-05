package hn.unah.lenguajes.datos.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "tipocliente")
public class TipoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipocliente")
    private Integer idTipoCliente;

    private String descripcion;

    @OneToMany(mappedBy="tipoCliente") //en Posman se pone este tipoCliente no en minuscula
    private List<Cliente> cliente;

}
