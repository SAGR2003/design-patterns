class FabricaDePersonajeDeadWar implements FabricaDePersonaje {
    
    @Override
    public Personaje crearPersonaje() {
        return new Zombie();
    }

    @Override
    public Arma crearArma() {
        return new Espada();
    }
}