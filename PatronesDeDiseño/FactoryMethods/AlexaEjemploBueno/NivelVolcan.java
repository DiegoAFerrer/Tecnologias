public class NivelVolcan extends Nivel {

    public NivelVolcan() {
        super("Volcán Infernal");
    }
    
    @Override 
    public Enemigo crearEnemigo(){
        return new Dragon();
    }
}
