package hn.unah.lenguajes.datos.demo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.datos.demo.entities.TipoCliente;
import hn.unah.lenguajes.datos.demo.repositories.TipoClienteRepository;
import hn.unah.lenguajes.datos.demo.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{
    
    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {
        return (TipoCliente)this.tipoClienteRepository.save(tipoCliente);
    }

    
}
