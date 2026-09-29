public class DonRamon implements Inquilino, Habitante, Educador {
    private final String nombre = "Don Ramon";

    @Override 
    public void pagarRenta(){
        System.out.println(nombre + " le jura al señor barriga que le paga la proxuma semana.");
    }

    @Override 
    public void interactuarConElChavo(){
        System.out.println(nombre + "le pega al chavo");
    }

     @Override 
    public void pasarLista(){
        System.out.println(nombre + " pasa la lista de la clase");
    }

    @Override
    public void impartirClase(){
        System.out.println(nombre + ": esto significa PELIGROOOOO!!!!!");
    }

    @Override 
    public void hacerCoraje(){
        System.out.println(nombre + " le grita al Chavo REPROBADO");
    }
}
