package Singleton;

public class SingletonEjemplo {
	public static void main(String[] args) {
        Configuracion config1 = Configuracion.getInstancia();
        Configuracion config2 = Configuracion.getInstancia();

        config1.mostrarConfiguracion();
        System.out.println(config1 == config2);  // Verifica que ambas referencias sean iguales
    }
}