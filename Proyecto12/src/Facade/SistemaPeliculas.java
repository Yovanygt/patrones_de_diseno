package Facade;

class SistemaPeliculas {
    public void mostrarPeliculas() {
        System.out.println("Películas disponibles:");
        System.out.println("1. Avatar 2");
        System.out.println("2. Avengers: Endgame");
        System.out.println("3. Joker");
    }
    
    public void seleccionarPelicula(String pelicula) {
        System.out.println("Película seleccionada: " + pelicula);
    }
}    