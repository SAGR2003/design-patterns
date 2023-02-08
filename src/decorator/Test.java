public class Test {
    public static void main(String[] args) {
        System.out.println("\n Menu Empanadas la Sabana");

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

        
        Empanada pollo = new EmpanadaPollo();
        System.out.println("Precio empanada de carne: " + carne.precio());

        Empanada polloConQueso = new QuesoDecorator(pollo);
        System.out.println("Precio empanada de pollo con extra queso: " + polloConQueso.precio());

        Empanada polloConGaseosa = new GaseosaDecorator(pollo);
        System.out.println("Precio empanada de pollo con gaseosa: " + polloConGaseosa.precio());

        Empanada polloConGuacamole = new GuacamoleDecorator(pollo);
        System.out.println("Precio empanada de pollo con guacamole: " + polloConGuacamole.precio());

        Empanada polloConQuesoYGaseosa = new GaseosaDecorator(new QuesoDecorator(pollo));
        System.out.println("Precio combo empanada de pollo con gaseosa y queso extra: " + polloConQuesoYGaseosa.precio());

        Empanada polloConQuesoYGuacamole = new GuacamoleDecorator(new QuesoDecorator(pollo));
        System.out.println("Precio combo empanada de pollo con guacamole y queso extra: " + polloConQuesoYGuacamole.precio());


        Empanada polloConGuacamoleQuesoYGaseosa = new GuacamoleDecorator(new GaseosaDecorator(new QuesoDecorator(pollo)));
        System.out.println("Precio combo completo (empanada de pollo con gaseosa, guacamole y queso extra): " + polloConGuacamoleQuesoYGaseosa.precio());

    }

}