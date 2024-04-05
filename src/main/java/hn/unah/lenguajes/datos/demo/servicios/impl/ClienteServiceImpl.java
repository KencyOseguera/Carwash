package hn.unah.lenguajes.datos.demo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.datos.demo.entities.Cliente;
import hn.unah.lenguajes.datos.demo.repositories.ClienteRepository;
import hn.unah.lenguajes.datos.demo.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return (Cliente)this.clienteRepository.save(cliente);
    }
    
}
