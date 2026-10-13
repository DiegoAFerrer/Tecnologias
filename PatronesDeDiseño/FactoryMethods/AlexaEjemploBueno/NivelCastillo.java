public class NivelCastillo extends Nivel {

    public NivelCastillo() {
        super("Castillo Embrujado");
    }
    
    @Override 
    public Enemigo crearEnemigo(){
        return new Esqueleto();
    }
}
