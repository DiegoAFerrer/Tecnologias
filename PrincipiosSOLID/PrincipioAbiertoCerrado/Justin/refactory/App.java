public class App {
    public static void main(String[] args) throws Exception{
        Bebida[] bebidas = {
            new Agua("Ciel", 20), 
            new Refresco("Coca-Cola", 25), 
            new Cerveza("Corona", 30)
        };

        Caja caja = new Caja();
        caja.cobrar(bebidas, new DescuentoNavidad(), 100);
    }
}
