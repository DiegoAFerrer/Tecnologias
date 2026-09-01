Guerrero guerrero1 = new Guerrero("Justin");
Mago mago1 = new Mago ("Christopher");

System.Console.WriteLine($"{Duelo}");

System.Console.WriteLine($"{mago1.nombre} vs {guerrero1.nombre}");

while(mago1.estadoVida && guerrero1.estadoVida)
{
    System.Console.WriteLine("1. Guerrerp Ataca a Mago");
    Sytem.Console.WriteLine("2. Mago ataca a guerrero");
    Sytem.Console.WriteLine("3. Mago usa habilidad");
    System.Console.WriteLine("Elija una opción");
    string? opcion = Console.ReadLine();


    switch(opcion)
    {
        case "1":
            guerrero1.Ataque(mago1);
            break;
        case "2":
            mago1.Ataque(guerrero1);
            break;
        case "3":
            mago1.UsarHabilidad();
            break;
        default:
            break;
    }

    if (mago1.estadoVida)
    {
        System.Console.WriteLine("Gana Mago");
    } else
    {
        System.Console.WriteLine("Gana Guerrero");
    }
}