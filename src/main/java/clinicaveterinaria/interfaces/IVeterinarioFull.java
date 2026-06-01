package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Veterinario;

public interface IVeterinarioFull extends IVeterinarioReadOnly{
    void actualizarVeterinario(Veterinario veterinario);

    void eliminarVeterinario(int id);
}
