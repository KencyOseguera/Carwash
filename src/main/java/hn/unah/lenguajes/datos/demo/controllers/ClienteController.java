package hn.unah.lenguajes.datos.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.datos.demo.entities.Cliente;
import hn.unah.lenguajes.datos.demo.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente ){
        return this.clienteServiceImpl.crearCliente(cliente);
    }

}
