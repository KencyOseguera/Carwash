package hn.unah.lenguajes.datos.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.datos.demo.entities.TipoCliente;


@Repository
public interface TipoClienteRepository extends CrudRepository<TipoCliente, Integer >{

}
