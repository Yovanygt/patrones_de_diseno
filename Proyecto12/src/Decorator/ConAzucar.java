package Decorator;

class ConAzucar extends CafeDecorador {
    public ConAzucar(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    public String descripcion() {
        return cafeDecorado.descripcion() + ", con azúcar";
    }

    public double costo() {
        return cafeDecorado.costo() + 2.0;
    }
}