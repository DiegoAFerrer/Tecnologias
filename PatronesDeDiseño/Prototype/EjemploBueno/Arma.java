public class Arma implements Prototipo{
    private String nombre;
    private int daño;

    public Arma(String nombre, int daño){
        this.nombre = nombre;
        this.daño = daño;
    }

    @Override 
    public Arma clonar(){
        return new Arma(nombre, daño);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }


    @Override 
    public String toString(){
        return nombre + "(" + daño + ")";
    }

}
