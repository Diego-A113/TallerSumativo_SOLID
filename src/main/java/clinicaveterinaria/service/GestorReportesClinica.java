package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.IAuditable;


public class GestorReportesClinica {
    private final IAuditable auditable;

    public GestorReportesClinica(IAuditable auditable) {
        this.auditable = auditable;
    }

    public void imprimirResumenOperaciones() {
        System.out.println("Resumen interno: " + auditable.getAuditoria());
    }
}
