package Observer;

public class ObserverEjemplo {
    public static void main(String[] args) {
        Clima clima = new Clima();
        Observador pantalla1 = new PantallaTemperatura();
        Observador pantalla2 = new PantallaTemperatura();

        clima.agregar(pantalla1);
        clima.agregar(pantalla2);

        clima.setTemperatura(25);
        clima.setTemperatura(30);
    }
}