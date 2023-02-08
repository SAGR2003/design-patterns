public class Juego {
    
    private FabricaDePersonaje fabricaDePersonaje;

    Juego(FabricaDePersonaje fabricaDePersonaje) {
        this.fabricaDePersonaje = fabricaDePersonaje;
    }

    void jugar() {
        Personaje personaje = fabricaDePersonaje.crearPersonaje();
        Arma arma = fabricaDePersonaje.crearArma();
        System.out.println("Jugando como " + personaje.getTipo() + " con " + arma.getTipo());
    }
}
