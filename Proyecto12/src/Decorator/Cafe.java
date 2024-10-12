package Decorator;

interface Cafe {
    String descripcion();
    double costo();
}

// Clase concreta
class CafeBasico implements Cafe {
    public String descripcion() {
        return "Café básico";
    }

    public double costo() {
        return 10.0;
    }
}