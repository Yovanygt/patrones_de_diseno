package Facade;

public class FacadeEjemplo {
	   public static void main(String[] args) {
	        CineFacade cine = new CineFacade();
	        
	        // Selección del cliente
	        String pelicula = "Avatar 2";
	        String tipoEntrada = "VIP";
	        String tipoComida = "Combo de palomitas y refresco";
	        
	        cine.disfrutarCine(pelicula, tipoEntrada, tipoComida);
	    }
	}