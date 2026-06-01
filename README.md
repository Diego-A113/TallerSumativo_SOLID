# ClinicaVeterinaria

Proyecto Java Maven para practicar refactoring con principios SOLID en un taller colaborativo.

El sistema funciona desde el inicio, pero contiene violaciones intencionales de SRP, OCP, LSP, ISP y DIP. La idea es que cada integrante refactorice una zona del código sin romper la ejecución.

## Setup en 5 minutos


Compilar con Maven. Salida esperada:

```text
=== ClinicaVeterinaria funcionando ===
```

## Estructura del proyecto

```text
src/main/java/clinicaveterinaria/
├── Main.java
├── interfaces/
│   ├── IAnimal.java
│   ├── IBaseDatos.java
│   ├── IServicioClinica.java
│   ├── ITratamiento.java
│   └── IVeterinarioService.java
├── model/
│   ├── Mascota.java
│   ├── Veterinario.java
│   ├── Cita.java
│   ├── Tratamiento.java
│   ├── Factura.java
│   └── clases auxiliares para animales y enums
├── repository/
│   ├── BaseDatos.java
│   └── DirectoBaseDatos.java
└── service/
    ├── ReservaService.java
    ├── DiagnosticoService.java
    ├── FacturacionService.java
    ├── ReporteService.java
    └── servicios CRUD y clases con violaciones intencionales
```

## Trabajo del taller

- Integrante 1: refactorizar SRP.
- Integrante 2: refactorizar OCP.
- Integrante 3: refactorizar LSP. Nombre: Diego Beltran
  ¿Por qué lanzar `UnsupportedOperationException` puede ser señal de mal diseño?
  Porque representa un error inesperado ya que por ejemplo si se quiere utilizar el metodo volar en un pez, este codigo fuerza a lanzar una excepcion e indicar que los peces no vuelan, pero esto es una mala practica de programacion.

- ¿Qué contrato estaba prometiendo `Animal`?
  Estaba prometiendo los contratos de "Nadar", "Volar" y "Caminar" a todas sus clases hijas, lo cual no es del todo eficiente, ya que no todas sus clases hijas utilizaran todos los metodos del contrato de la clase Padre, donde dichos metodos provienen de la interfaz IAnimal

- ¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?
  El diseño se vuelve mas escalable y evita errores en herencia ya que dividimos la interfaz grande a interfaces pequeñas que contienen la accion asignada


- Integrante 4: refactorizar ISP y DIP.

Lee `guia.md` para instrucciones, checklists y preguntas de discusión.
