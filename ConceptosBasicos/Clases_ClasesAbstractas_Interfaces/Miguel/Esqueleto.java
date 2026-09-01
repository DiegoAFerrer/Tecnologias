public class Esqueleto extends MobHostil {
    public Esqueleto(){
        super("Esqueleto", 20);
    }

    @Override
    public void atacar(){
        System.out.println("El Esqueleto dispara flechas hacia ti");
    }
}