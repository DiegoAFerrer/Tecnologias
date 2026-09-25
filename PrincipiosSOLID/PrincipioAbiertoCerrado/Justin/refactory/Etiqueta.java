public enum Etiqueta {

    SIN_IVA("(Lbre de Impuestos)"),
    CON_IVA("(IVA INCLUIDO)"),
    CON_IEPS(("IVA + IEPS incluido"));

    private final String descripcion;

    Etiqueta(String descripcion){
        this.descripcion = descripcion;
    }
}
