package Singleton;

public class Configuracion {
    private static Configuracion instancia;

    private Configuracion() {
        // Constructor privado para evitar instancias externas
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public void mostrarConfiguracion() {
        System.out.println("Mostrando configuración");
    }
}