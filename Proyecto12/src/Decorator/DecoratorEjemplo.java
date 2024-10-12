package Decorator;

public class DecoratorEjemplo {
    public static void main(String[] args) {
        Cafe miCafe = new CafeBasico();
        System.out.println(miCafe.descripcion() + " $" + miCafe.costo());

        miCafe = new ConLeche(miCafe);
        System.out.println(miCafe.descripcion() + " $" + miCafe.costo());

        miCafe = new ConAzucar(miCafe);
        System.out.println(miCafe.descripcion() + " $" + miCafe.costo());
    }
}