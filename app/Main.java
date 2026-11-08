package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("AGENCIA DE TURISMO LLANQUIHUE TOUR");
        System.out.println("=================================================");

        // Direcciones
        Direccion dir1 = new Direccion(
                "Costanera 450",
                "Puerto Varas",
                "Los Lagos");

        Direccion dir2 = new Direccion(
                "O'Higgins 123",
                "Llanquihue",
                "Los Lagos");

        // Objetos
        Persona cliente = new Persona(
                "12345678-9",
                "Fernanda López",
                dir1);

        Empleado guia = new Empleado(
                "98765432-1",
                "Juan Pérez",
                dir2,
                "Guía de Montaña");

        Empleado administrativo = new Empleado(
                "11222333-4",
                "Ana María",
                dir1,
                "Secretaria");

        // Mostrar resultados
        System.out.println("\n--- CLIENTE ---");
        System.out.println(cliente);

        System.out.println("\n--- EMPLEADO 1 ---");
        System.out.println(guia);

        System.out.println("\n--- EMPLEADO 2 ---");
        System.out.println(administrativo);

        System.out.println("\n=================================================");
        System.out.println("Programa ejecutado correctamente");
    }
}
