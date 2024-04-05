package hn.unah.lenguajes.datos.demo.servicios;

import hn.unah.lenguajes.datos.demo.entities.TipoVehiculo;

public interface TipoVehiculoService {
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);

    String eliminarTipoVehiculo(Integer idTipoVehiculo);
}
