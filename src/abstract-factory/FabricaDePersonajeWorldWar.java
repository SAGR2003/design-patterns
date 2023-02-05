class FabricaDePersonajeWorldWar implements FabricaDePersonaje {
    @Override
    public Personaje crearPersonaje() {
        return new Piloto();
    }

    @Override
    public Arma crearArma() {
        return new Avion();
    }
}