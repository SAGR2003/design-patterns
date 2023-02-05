 class GaseosaDecorator extends EmpanadaDecorator{
    public GaseosaDecorator(Empanada empanada){
        super(empanada);

    }
     @Override
     public double precio(){
        return super.precio()+ 4000;
     }
}