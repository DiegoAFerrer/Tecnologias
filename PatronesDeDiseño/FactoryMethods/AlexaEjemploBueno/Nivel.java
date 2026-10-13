public abstract class Nivel {
    protected String nombre;

    public Nivel(String nombre) {
        this.nombre = nombre;
    }

    public abstract Enemigo crearEnemigo();

    public void jugar(){
        Enemigo enemigo = crearEnemigo();
        int vidaJugador = 250;
        int dañoJugador = 60;
        int turno = 1;

        System.out.println("\n===" + nombre + "===");
        System.out.println("Aparece un " + enemigo.getNombre() + " con " + enemigo.getVida() + " puntos de vida");

        while(enemigo.estaVivo() && vidaJugador > 0){

            System.out.println("\nturno: " + turno);


            enemigo.recibirDaño(dañoJugador);
            System.out.println("Has atacado al " + enemigo.getNombre() + "; le quedan " + enemigo.getVida() + " puntos de vida");

            if(enemigo.estaVivo()){
                enemigo.atacar();
                vidaJugador -= enemigo.getAtaque();
            }

            turno++;
        }

        if(vidaJugador > 0){
            System.out.println("¡Ganaste chaval!");
        } else{
            System.out.println("¡Perdiste eres noob!");
        }
        
    }
}
