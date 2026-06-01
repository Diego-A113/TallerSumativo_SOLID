package clinicaveterinaria.service;

import java.time.LocalDate;

import clinicaveterinaria.interfaces.IDirectoBase;
import clinicaveterinaria.interfaces.IVeterinarioService;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Veterinario;

public class Clinica {
    private final IVeterinarioService veterinarioService;
    private final IDirectoBase baseDatos;

    public Clinica(IVeterinarioService veterinarioService, IDirectoBase baseDatos) {
        this.veterinarioService = veterinarioService;
        this.baseDatos = baseDatos;
    }

    public Cita agendarConsultaRapida(Mascota mascota, Veterinario veterinario) {
        baseDatos.conectar();
        Cita cita = veterinarioService.reservarCita(mascota, veterinario, LocalDate.now());
        baseDatos.getCitas().add(cita);
        return cita;
    }
}
