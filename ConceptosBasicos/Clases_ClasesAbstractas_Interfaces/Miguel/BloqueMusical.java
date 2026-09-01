public class BloqueMusical implements ActivablePorRedstone{
    @Override
    public void activar() {
        System.out.println("Toca nota");
    }

    @Override 
    public void desactivar(){
        System.out.println("Deja de tocar nota");
    }
}