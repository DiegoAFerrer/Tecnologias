class GoombaMutante
    def atacar(jugador)
        jugador.vidas -= 1
        puts "Daño recibido: 1. Vidas Restantes: #{jugador.vidas}"