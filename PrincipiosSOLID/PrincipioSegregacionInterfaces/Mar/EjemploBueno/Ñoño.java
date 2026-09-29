public class Ñoño implements Niño {
    private final String nombre = "Ñoño";

    @Override
    public void llorar() {
        System.out.println(nombre + " llora por Paty");
    }

    @Override
    public void cantar() {
        System.out.println(nombre + ": *proyectada*");
    }
}
