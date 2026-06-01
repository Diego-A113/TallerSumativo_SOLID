package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.ITratamiento;

public class FisioterapiaTratamiento implements ITratamiento{
    private final double costo;

    public FisioterapiaTratamiento(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCostoFinal() {
            return costo * 1.10;
    }

    @Override
    public String obtenerIndicaciones() {
            return "Administrar segun receta.";
    }
}
