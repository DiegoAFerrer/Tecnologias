import java.util.List;

public class App {
    public static void main(String[] args) {
        Ñoño ñoño = new Ñoño();
        DonRamon donRamon = new DonRamon();
        ProfesorJirafales jirafales = new ProfesorJirafales();


        //Interfaz para el profesor jirafales 
        for (Educador e : educadores) {
            e.impartirClase();
            e.pasarLista();
            e.hacerCoraje();
        }

        //Interfaz para don ramon  
        List<Inquilino>inquilinos = List.of(donRamon);
        for (Inquilino i : inquilinos) {
            i.pagarRenta();
        }

        //Interfaz para habitantes  
        List<Habitante> habitantes = List.of(donRamon, jirafales);
        for (Habitante h : habitantes) {
            h.interactuarConElChavo();
        }

        //interfaz para niño
        List<Niño> niños = List.of(ñoño);
        for (Niño n : niños) {
            n.llorar();
            n.cantar();
        }

    }
}
