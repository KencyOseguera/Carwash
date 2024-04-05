package hn.unah.lenguajes.datos.demo.controllers;

import hn.unah.lenguajes.datos.demo.entities.TipoVehiculo;
import hn.unah.lenguajes.datos.demo.servicios.impl.TipoVehiculoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/tipovehiculo/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo ){
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }

    @DeleteMapping("tipovehiculo/eliminar")
    public String eliminarTipoVehiculo(@RequestParam Integer idTipoVehiculo) {
        return this.tipoVehiculoServiceImpl.eliminarTipoVehiculo(idTipoVehiculo);
    }
}
