public class Main {
    public static void main(String[] args) {
        FabricaDePersonaje magicWar = new FabricaDePersonajeMagicWar();
        Juego mago = new Juego(magicWar);
        mago.jugar();

        FabricaDePersonaje deadWar = new FabricaDePersonajeDeadWar();
        Juego zombie = new Juego(deadWar);
        zombie.jugar();

        FabricaDePersonaje worldWar = new FabricaDePersonajeWorldWar();
        Juego piloto = new Juego(worldWar);
        piloto.jugar();
    }
}
