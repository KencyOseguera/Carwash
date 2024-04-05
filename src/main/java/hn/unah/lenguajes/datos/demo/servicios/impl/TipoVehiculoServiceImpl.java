package hn.unah.lenguajes.datos.demo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.datos.demo.entities.TipoVehiculo;
import hn.unah.lenguajes.datos.demo.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes.datos.demo.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;
    
    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return (TipoVehiculo)this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public String eliminarTipoVehiculo(Integer idTipoVehiculo) {
        if (this.tipoVehiculoRepository.existsById(idTipoVehiculo)) {
            this.tipoVehiculoRepository.deleteById(idTipoVehiculo);
            return "TipoCliente eliminado";
        } else {
            return "No existe el TipoCliente";
        }
    }
    
}
