package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Veterinario;

public interface IVeterinarioReadOnly {
    void crearVeterinario(Veterinario veterinario);

    Veterinario obtenerVeterinario(int id);
}
