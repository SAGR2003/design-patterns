 class QuesoDecorator extends EmpanadaDecorator{
    public QuesoDecorator(Empanada empanada){
        super(empanada);

    }

     @Override
     public double precio(){
         return super.precio()+ 800;
     }
}