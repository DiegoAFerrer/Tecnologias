public class NivelBosque extends Nivel {

    public NivelBosque() {
        super("Bosque Oscuro");
    }

    @Override
    public Enemigo crearEnemigo(){
        return new Lobo();
    }
}
