 class GuacamoleDecorator extends EmpanadaDecorator{

    public GuacamoleDecorator(Empanada empanada){
        super(empanada);

    }
    
     @Override
     public double precio(){
        return super.precio()+ 600;
     }
}