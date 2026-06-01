package clinicaveterinaria.model;

import java.util.Objects;

import clinicaveterinaria.interfaces.ITratamiento;


public class Tratamiento {
    private int id;
    private String descripcion;
    private double costo;
    ITratamiento tratamiento;
    public Tratamiento(int id, ITratamiento tipo, String descripcion, double costo) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
         this.tratamiento =tipo ;
    }
    
    public void c(){
        tratamiento.calcularCostoFinal();
         tratamiento.obtenerIndicaciones();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ITratamiento getTipo() {
        return tratamiento;
    }

    public void setTipo(ITratamiento tipo) {
        this.tratamiento = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tratamiento)) {
            return false;
        }
        Tratamiento that = (Tratamiento) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "id=" + id +
                ", tipo=" + tratamiento +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                '}';
    }
}
