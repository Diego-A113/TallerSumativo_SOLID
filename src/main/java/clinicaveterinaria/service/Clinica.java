package clinicaveterinaria.service;

import java.time.LocalDate;

import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Veterinario;
import clinicaveterinaria.repository.DirectoBaseDatos;

public class Clinica {
    private final DirectoVeterinario veterinarioService;
    private final DirectoBaseDatos baseDatos;

    public Clinica(DirectoVeterinario veterinarioService, DirectoBaseDatos baseDatos) {
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
