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
- Integrante 3: refactorizar LSP.
- Integrante 4: refactorizar ISP y DIP.

Lee `guia.md` para instrucciones, checklists y preguntas de discusión.

- ¿Qué problema causa una interfaz gigante en equipos grandes?
Lleva demasiados problemas, ya que hay clases que van a necesitar solo algunos metodos de esa interfaz y no todos, así violando el principio ISP al tener que depender de métodos que no usa.
- ¿Por qué `new DirectoBaseDatos()` dificulta cambiar o probar la clase?
Porque en un contexto real dificultaria cambiar o probar el codigo ya que el objetivo de este metodo es agregar una cita rapida para probar el sistema y este mismo no se podria ejecutar sin internet, ademas de que habria que cambiar la clase si se desea cambiar de base de datos, asi que en vez de crear un new DirectoBaseDatos es mejor usar una abstraccion de una interfaz.
- ¿Qué dependencia debería conocer el código de alto nivel: interfaz o clase concreta?
La regla del concepto DIP es que el codigo de alto nivel solo debe conocer la abstraccion (las interfaces), jamas los detalles o la clase concreta.
