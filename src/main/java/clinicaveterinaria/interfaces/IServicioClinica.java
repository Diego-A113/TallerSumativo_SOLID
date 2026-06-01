package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Tratamiento;


public interface IServicioClinica {
    void crearTratamiento(Tratamiento tratamiento);

    double calcularTratamiento(Tratamiento tratamiento);
}
