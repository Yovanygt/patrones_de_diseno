package Decorator;

class ConLeche extends CafeDecorador {
    public ConLeche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    public String descripcion() {
        return cafeDecorado.descripcion() + ", con leche";
    }

    public double costo() {
        return cafeDecorado.costo() + 5.0;
    }
}