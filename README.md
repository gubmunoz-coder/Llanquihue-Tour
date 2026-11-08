Llanquihue Tour - Sistema de Gestión de Personas
Descripción
Este proyecto fue desarrollado para la asignatura Desarrollo Orientado a Objetos I.

El sistema representa un modelo básico para la agencia de turismo Llanquihue Tour, permitiendo gestionar información de personas relacionadas con la organización mediante la aplicación de conceptos fundamentales de Programación Orientada a Objetos (POO).

Se implementan principios como:

Encapsulamiento
Herencia
Composición
Reutilización de clases
Organización modular mediante paquetes
Estructura del Proyecto
src
├── app
│   └── Main.java
│
└── model
    ├── Direccion.java
    ├── Persona.java
    └── Empleado.java
Clases Implementadas
Direccion
Representa la dirección de una persona.

Atributos:

calle
comuna
region
Métodos:

Constructor
Getters y Setters
toString()
Persona
Clase base del sistema.

Atributos:

rut
nombre
direccion
Métodos:

Constructor
Getters y Setters
toString()
Relación:

Contiene un objeto Direccion (Composición)
Empleado
Clase derivada que hereda de Persona.

Atributos:

cargo
Métodos:

Constructor
Getters y Setters
toString()
Relación:

Hereda de Persona (Herencia)
Tecnologías Utilizadas
Java
IntelliJ IDEA
OpenJDK
Ejecución
Abrir el proyecto en IntelliJ IDEA.
Verificar que el JDK esté configurado correctamente.
Ejecutar la clase:
app.Main
El programa mostrará por consola la información de los objetos creados.
Ejemplo de Salida
=================================================
AGENCIA DE TURISMO LLANQUIHUE TOUR
=================================================

--- CLIENTE ---
Rut: 12345678-9
Nombre: Fernanda López
Direccion: Costanera 450, Puerto Varas, Los Lagos

--- EMPLEADO 1 ---
Rut: 98765432-1
Nombre: Juan Pérez
Direccion: O'Higgins 123, Llanquihue, Los Lagos
Cargo: Guía de Montaña

--- EMPLEADO 2 ---
Rut: 11222333-4
Nombre: Ana María
Direccion: Costanera 450, Puerto Varas, Los Lagos
Cargo: Secretaria

=================================================
Programa ejecutado correctamente
Autor Gubica Muñoz Toledo

Asignatura: Desarrollo Orientado a Objetos I

Duoc UC
