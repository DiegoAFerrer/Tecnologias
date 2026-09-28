public class Cliente {
    private String nombre;
    private String id;
    private CuentaBancaria cuenta;

    public Cliente(String nombre, String id, CuentaBancaria cuenta){
        this.nombre = nombre;
        this.id = id;
        this.cuenta = cuenta;
    }

    public String getNombre(){
        return nombre;
    }

    public String getId(){
        return id;
    }

    public CuentaBancaria getCuentaBancaria(){
        return cuenta;
    }

    public void depositar(double cantidad){
        cuenta.depositar(cantidad);
    }

    public void retirar(double cantidad){
        cuenta.retirar(cantidad);
    }

    public double consultarSaldo(){
        return cuenta.consultarSaldo();
    }

    public double calcularIntereses(){
        return cuenta.calcularIntereses();
    }

    public void pagarDeuda(double cantidad){
        cuenta.pagarDeuda(cantidad);
    }

    public void mostrarInformacion(){
        System.out.println("nombre: " + nombre);
        System.out.println("Cuenta" + id);
        System.out.println("Cuenta: " + cuenta + "Saldo: $" + cuenta.consultarSaldo());
    }
}