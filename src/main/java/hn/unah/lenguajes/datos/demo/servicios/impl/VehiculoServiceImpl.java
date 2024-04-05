package hn.unah.lenguajes.datos.demo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.datos.demo.entities.Vehiculo;
import hn.unah.lenguajes.datos.demo.repositories.VehiculoRepository;
import hn.unah.lenguajes.datos.demo.servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;
    

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return (Vehiculo)this.vehiculoRepository.save(vehiculo);
    }

    

}
