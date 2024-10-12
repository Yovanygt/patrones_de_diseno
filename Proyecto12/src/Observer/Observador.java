package Observer;

interface Observador {
    void actualizar(int temperatura);
}

class PantallaTemperatura implements Observador {
    public void actualizar(int temperatura) {
        System.out.println("Pantalla actualizada: " + temperatura + " grados.");
    }
}

