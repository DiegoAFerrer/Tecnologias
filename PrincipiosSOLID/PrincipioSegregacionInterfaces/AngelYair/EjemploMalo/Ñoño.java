public class Ñoño implements AccionesPersonaje{
    private final String nombre = "Ñoño";

    @Override
    public void darGolpe(){
        throw new UnsupportedOperationException(nombre + ": No pega");
    }

    @Override
    public void pagarRenta(){
        throw new UnsupportedOperationException(nombre + ": Es niño, no paga");
    }

    @Override 
    public void cobrarRenta(){
        throw new UnsupportedOperationException(nombre + ": No es dueño de la vecindad del Chavo");
    }

    @Override 
    public void jugar(){
        System.out.println(nombre + ": Juega con su pelota de playa");
    }

    @Override 
    public void llorar(){
        System.out.println(nombre + ": AJA I, AJA I, AJA I");
    }
}