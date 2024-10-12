package Observer;

import java.util.ArrayList;
import java.util.List;

interface Sujeto {
    void agregar(Observador o);
    void remover(Observador o);
    void notificar();
}

class Clima implements Sujeto {
    private List<Observador> observadores;
    private int temperatura;

    public Clima() {
        this.observadores = new ArrayList<>();
    }

    public void agregar(Observador o) {
        observadores.add(o);
    }

    public void remover(Observador o) {
        observadores.remove(o);
    }

    public void notificar() {
        for (Observador o : observadores) {
            o.actualizar(temperatura);
        }
    }

    public void setTemperatura(int nuevaTemperatura) {
        this.temperatura = nuevaTemperatura;
        notificar();
    }
}