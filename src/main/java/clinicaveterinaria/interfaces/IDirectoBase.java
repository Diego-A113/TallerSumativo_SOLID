package clinicaveterinaria.interfaces;

import java.util.List;

import clinicaveterinaria.model.Cita;

public interface IDirectoBase {
    public void conectar();

    public List<Cita> getCitas();

}
