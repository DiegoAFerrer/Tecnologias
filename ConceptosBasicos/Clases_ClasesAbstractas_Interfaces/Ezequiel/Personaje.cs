abstract class Personaje
{
    public string nombre {get ; private set; }
    public int puntosVida {get; protected set; }
    public bool estadoVida {get {return Vida > 0;}}

    public Personaje(string nombre){
        nombre = nombre;
        puntosvida = 100;
    }

    public void recibirDaño(int cantidad)
    {
        puntosVida -= cantidad;
        if(puntosVida <= 0) puntosVida = 0;
        System.Console.WriteLine($"{nombre} recibió un daño de {cantidad}, sus puntos de vida son {{puntosVida}}");
    }

    public abstract void ataque (Personaje objetivo);
}