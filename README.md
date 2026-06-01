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
## Nombre:Angie Liliana Inga Ontaneda

## Integrante 2: refactorizar OCP.
    Se necesitaba refactorizar el codigo de Tratamiento.java porque constaba de if y else, y eso hace que 
    el codigo a largo plazo sea manipulado a la hora querer agregar mas tipos de tratamientos. Para
    esto se creo clases que implemente  la clase Itratamiento, estas clases son creadas por cada tipo de tratamiento, asi si se desea agreagar más pues solo se cree otra clase con el respectivo tipo de tratamiento asi permitiendo que no se manipule mucho el codigo.
## Integrante 2: Pregunta de discusion
    - ¿Por qué los condicionales repetidos hacen más caro el cambio?
        Porque no es un codigo mantenible, podrian ser 20 if e igualmente no se un codigo mantenible. No es recomendable.
    - ¿Qué pasaría si agregamos `Odontologia` como tratamiento?
        Pues se tendria que crear una clase para odontologia que immplemente Itratamiento
    - ¿Cuándo una interfaz ayuda a extender el sistema?
        Cuando son muchas clases que van a requerir de los mismo metodos.
Lee `guia.md` para instrucciones, checklists y preguntas de discusión.
