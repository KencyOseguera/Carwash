package hn.unah.lenguajes.datos.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.datos.demo.entities.Vehiculo;
import hn.unah.lenguajes.datos.demo.servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/vehiculo/crear")
    public Vehiculo crearTipoCliente(@RequestBody Vehiculo vehiculo ){
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }
}
