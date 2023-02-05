abstract class EmpanadaDecorator implements Empanada {
    protected Empanada empanada;
    public EmpanadaDecorator (Empanada empanada){
        this.empanada= empanada;


    }
    @Override
    public double precio(){
        return empanada.precio();
    }
}