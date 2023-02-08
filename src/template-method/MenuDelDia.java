abstract class MenuDelDia {

    final void crearMenu() {
        saludo();
        anadirsopa();
        anadirProteina();
        anadirHarina();
        anadirJugo();
        despedida();
    }

    void saludo() {
        System.out.println("Bienvenido! Este es el menu de hoy:");
    }

    void anadirsopa() {
        System.out.println("Sopa: Verduras");
    }

    abstract void anadirProteina();

    abstract void anadirHarina();

    abstract void anadirJugo();

    void despedida() {
        System.out.println("Por solo $12.000, te esperamos!!! :)");
    }
}
