class Mago : Personaje, IHabilidadEspecial
{
    public Mago(string nombre) : base(this.nombre)
    {}

    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{nombre} ataca con la espada a {objetivo.nombre}");
        objetivo.recibirDaño();
    }

    public override void UsarHabilidad()
    {
        puntosVida += 30;
        if(puntosVida < 100) puntosVida = 100;
        System.Console.WriteLine($"{nombre} regeneró 30 puntos de vidam su vida actual es {puntosVida}");
    }
}