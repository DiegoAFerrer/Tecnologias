public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("Sistema Bancario LSP MALO");

        CuentaBancaria ahorro = new CuentaAhorro("CA-001", 1000);
        CuentaBancaria corriente = new CuentaCorriente("CO-002", 5000, 200);
        CuentaBancaria credito = new CuentaCredito("CR-002", 15000);

        Cliente cliente1 = new Cliente("Alexa", "001", ahorro);
        Cliente cliente2 = new Cliente("Pamela", "002", corriente);
        Cliente cliente3 = new Cliente("Vanesa", "003", credito);

        cliente1.depositar(5000);
        cliente2.retirar(2000);

        System.out.println("Cuentas ahorro");
        cliente1.mostrarInformacion();
        cliente1.depositar(5000);
        cliente1.retirar(1000);
        System.out.println("Intereses: $");




        cliente2.mostrarInformacion();
        cliente2.retirar(6000);
        System.out.println("Saldo despues del retiro: $" + cliente2.consultarSaldo());
        System.out.println("Interes por sobregiro: $" + cliente2.calcularIntereses());

        cliente3.mostrarInformacion();
        cliente3.retirar(5000);
        System.out.println("Deuda: $" + ((CuentaCredito) credito).consultarDeuda());
        System.out.println("Interes por sobregiro: $" + cliente3.calcularIntereses());
        System.out.println("Intereses: $" + cliente3.calcularIntereses());



    }    
}
