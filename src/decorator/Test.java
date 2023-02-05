public class Test {
    public static void main(String[] args) {
        Empanada carne = new EmpanadaCarne();
        System.out.println("Precio empanada de carne: " + carne.precio());

        Empanada carneConQueso = new QuesoDecorator(carne);
        System.out.println("Precio empanada de carne con extra queso: " + carneConQueso.precio());

        Empanada carneConGaseosa = new GaseosaDecorator(carne);
        System.out.println("Precio empanada de carne con gaseosa: " + carneConGaseosa.precio());

        Empanada carneConGuacamole = new GuacamoleDecorator(carne);
        System.out.println("Precio empanada de carne con guacamole: " + carneConGuacamole.precio());

        Empanada carneConQuesoYGaseosa = new GaseosaDecorator(new QuesoDecorator(carne));
        System.out.println("Precio combo empanada de carne con gaseosa y queso extra: " + carneConQuesoYGaseosa.precio());

        Empanada carneConQuesoYGuacamole = new GuacamoleDecorator(new QuesoDecorator(carne));
        System.out.println("Precio combo empanada de carne con guacamole y queso extra: " + carneConQuesoYGuacamole.precio());


        Empanada carneConGuacamoleQuesoYGaseosa = new GuacamoleDecorator(new GaseosaDecorator(new QuesoDecorator(carne)));
        System.out.println("Precio combo completo (empanada de carne con gaseosa, guacamole y queso extra): " + carneConGuacamoleQuesoYGaseosa.precio());

    }

}