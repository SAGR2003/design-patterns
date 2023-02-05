
class FabricaDePersonajeMagicWar implements FabricaDePersonaje {

    @Override
    public Personaje crearPersonaje() {
        return new Mago();
    }

    @Override
    public Arma crearArma() {
        return new Varita();
    }
}
