

public class ProfesorJirafales implements Educador, Habitante{
    private final String nombre = "Profesor Jirafales";

    @Override 
    public void pasarLista(){
        System.out.println(nombre + " pasa la lista de la clase");
    }

    @Override
    public void impartirClase(){
        System.out.println(nombre + " da una clase de historia aburrida");
    }

    @Override 
    public void hacerCoraje(){
        System.out.println(nombre + ": TA TA TA TA TA TA TA");
    }

    @Override 
    public void interactuarConElChavo(){
        System.out.println(nombre + ": le invita una torta de jamón");
    }
}
