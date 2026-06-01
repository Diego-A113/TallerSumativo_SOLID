package clinicaveterinaria.repository;

import clinicaveterinaria.interfaces.IDirectoBase;


public class DirectoBaseDatos extends BaseDatos implements IDirectoBase{
    @Override
    public void conectar() {
        System.out.println("Conectado a la base simulada con new DirectoBaseDatos().");
    }
}
