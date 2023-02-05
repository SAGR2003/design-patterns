public class Menu {
    public static void main(String[] args) {
        MenuDelDia viernes = new Viernes();
        MenuDelDia sabado = new Sabado();
        MenuDelDia domingo = new Domingo();

        domingo.crearMenu();
    }
}