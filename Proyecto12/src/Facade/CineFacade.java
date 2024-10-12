package Facade;

class CineFacade {
    private SistemaEntradas entradas;
    private SistemaComida comida;
    private SistemaPeliculas peliculas;

    public CineFacade() {
        this.entradas = new SistemaEntradas();
        this.comida = new SistemaComida();
        this.peliculas = new SistemaPeliculas();
    }
    
    
 public void disfrutarCine(String pelicula, String tipoEntrada, String tipoComida) {
        peliculas.mostrarPeliculas();
        peliculas.seleccionarPelicula(pelicula);
        entradas.comprarEntrada(tipoEntrada);
        comida.comprarComida(tipoComida);
        System.out.println("¡Disfruta tu película!");
    }
}