public class AlmacenCentral : IAlmacen
{
    private List<Producto> _productos;
    private static readonly Lazy<AlmacenCentral> _instancia = 
        new Lazy<AlmacenCentral>(() => new AlmacenCentral());

    public static AlmacenCentral Instancia => _instancia.Value;

    private AlmacenCentral()
    {
        System.Console.WriteLine("Creando el almacén");
        _productos = new List<Producto>();
    }

    public List<Producto> ObtenerProductos() => _productos;
    public Producto BuscarProducto(int codigo) => _productos.FirstOrDefault(p => p.Codigo == codigo);
    public void AgregarProducto(Producto producto)
    {
        if(BuscarProducto(producto.Codigo == null))
        {
            _productos.Add(producto);
            return true;
        }

        return false;
    }
}