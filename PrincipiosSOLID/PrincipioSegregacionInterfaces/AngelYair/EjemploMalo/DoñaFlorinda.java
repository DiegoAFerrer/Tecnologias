public class DoñaFlorinda implements AccionesPersonaje{
    private final String nombre = "Doña Florinda";

    @Override
    public void darGolpe(){
        System.out.println(nombre + ": Vaya a implementar a su abuela!");
    }

    @Override
    public void pagarRenta(){
        System.out.println(nombre + ": Paga la renta de cinco mil pesos.");
    }

    @Override 
    public void cobrarRenta(){
        throw new UnsupportedOperationException(nombre + ": No es dueña de la vecindad del Chavo");
    }

    @Override 
    public void jugar(){
        throw new UnsupportedOperationException(nombre + ": No juega a nada");
    }

    @Override 
    public void llorar(){
        throw new UnsupportedOperationException(nombre + ": No llora");
    }
}
