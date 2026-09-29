public class App {
    public static void main(String[] args) {
        DonRamon ramon = new DonRamon();
        DoñaFlorinda florinda = new DoñaFlorinda();
        Ñoño ñoño = new Ñoño();

        System.out.println("La vecindad del Chavo");
        ramon.darGolpe();

        try {
            ramon.pagarRenta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ramon.jugar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ramon.llorar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            florinda.cobrarRenta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            florinda.jugar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            florinda.llorar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ñoño.jugar();
        ñoño.llorar();

        try {
            ñoño.cobrarRenta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
