package hn.unah.lenguajes.datos.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.datos.demo.entities.TipoCliente;
import hn.unah.lenguajes.datos.demo.servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/tipocliente/crear")
    public TipoCliente crearTipoCliente(@RequestBody TipoCliente tipoCliente ){
        return this.tipoClienteServiceImpl.crearTipoCliente(tipoCliente);
    }

}
