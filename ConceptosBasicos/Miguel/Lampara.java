public class Lampara implements ActivablePorRedstone{
    @Override
    public void activar() {
        System.out.println("Lampara se enciende");
    }

    @Override 
    public void desactivar(){
        System.out.println("Lampara se apaga");
    }
}