package Decorator;

abstract class CafeDecorador implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorador(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    public String descripcion() {
        return cafeDecorado.descripcion();
    }

    public double costo() {
        return cafeDecorado.costo();
    }
}
