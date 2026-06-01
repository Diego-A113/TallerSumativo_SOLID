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

- Integrante 1: refactorizar SRP. Estudiante: Anai Menendez
Explicacion:
Clase Veterinario - tenia cuatro motivos o razones para cambiar y estas eran reservaService, diagnosticoService, facturacionService y reporteService, lo cual no cumplia con con el principio SRP esto debido a que la clase aparte de representar a todo lo que tenia que ver con veterinario hacia otras funcionalidades. Se movio las funcionalidades mencionadas anteriormente en clases relacionadas como por ejemplo el metodo reporteService se movio hacia la clase de ReporteService y eso mismo se hizo con los otros metodos que no correspondian a la clase veterinario con el objetivo de que la clase veterinario tenga una sola razon o motivo de cambio.


- Integrante 2: refactorizar OCP.
- Integrante 3: refactorizar LSP.
- Integrante 4: refactorizar ISP y DIP.

Lee `guia.md` para instrucciones, checklists y preguntas de discusión.
