package hn.unah.lenguajes.datos.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.datos.demo.entities.TipoVehiculo;

@Repository
public interface TipoVehiculoRepository extends CrudRepository <TipoVehiculo, Integer>{

}
